package vrn.tarasovy.intensive.models.types;

import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;
import com.vladmihalcea.hibernate.type.util.Configuration;
import com.vladmihalcea.hibernate.type.util.ReflectionUtils;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.EnumType;
import org.hibernate.type.descriptor.java.JavaTypeDescriptor;
import vrn.tarasovy.intensive.enums.Role;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Properties;

public class RolePostgreSQLEnumType extends EnumType<Role> {

    public static final PostgreSQLEnumType INSTANCE = new PostgreSQLEnumType();

    private final Configuration configuration;

    public RolePostgreSQLEnumType() {
        this(Configuration.INSTANCE);
    }

    public RolePostgreSQLEnumType(Configuration configuration) {
        this.configuration = configuration;
    }

    public RolePostgreSQLEnumType(Class<? extends Enum> enumClass) {
        this();

        Class typeConfigurationClass = ReflectionUtils.getClassOrNull("org.hibernate.type.spi.TypeConfiguration");

        if(typeConfigurationClass != null) {
            Object typeConfiguration = ReflectionUtils.newInstance(typeConfigurationClass);

            Class enumJavaTypeDescriptorClass = ReflectionUtils.getClassOrNull("org.hibernate.type.descriptor.java.EnumJavaTypeDescriptor");

            Object enumJavaTypeDescriptor = ReflectionUtils.newInstance(enumJavaTypeDescriptorClass, new Object[] {enumClass}, new Class[]{enumClass.getClass()});

            Object javaTypeDescriptorRegistry = ReflectionUtils.invokeGetter(typeConfiguration, "javaTypeDescriptorRegistry");

            ReflectionUtils.invokeMethod(
                    javaTypeDescriptorRegistry,
                    ReflectionUtils.getMethod(javaTypeDescriptorRegistry, "addDescriptor", JavaTypeDescriptor.class),
                    enumJavaTypeDescriptor
            );

            ReflectionUtils.invokeSetter(this, "typeConfiguration", typeConfiguration);
        }

        Properties properties = new Properties();
        properties.setProperty("enumClass", enumClass.getName());
        properties.setProperty("useNamed", Boolean.TRUE.toString());
        setParameterValues(properties);
    }

    public void nullSafeSet(
            PreparedStatement st,
            Object value,
            int index,
            SharedSessionContractImplementor session)
            throws HibernateException, SQLException {
        st.setObject(index, value != null ? ((Enum) value).name() : null, Types.OTHER);
    }
}
