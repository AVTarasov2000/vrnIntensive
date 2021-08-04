package vrn.tarasovy.intensive.mappers.config;

import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;

@MapperConfig(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public class IgnoreUnmappedMapperConfig {
}
