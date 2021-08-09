package vrn.tarasovy.intensive.models.types;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.EnumType;
import vrn.tarasovy.intensive.enums.Role;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class RolePostgreSQLEnumType extends EnumType<Role> {

    public void nullSafeSet(
            PreparedStatement st,
            Object value,
            int index,
            SharedSessionContractImplementor session)
            throws HibernateException, SQLException {
        st.setObject(
                index,
                value != null ?
                        ((Role) value).name() :
                        Role.USER,
                Types.OTHER
        );
    }
}
