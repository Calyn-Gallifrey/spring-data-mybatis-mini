/*
 * Copyright 2017-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.vonchange.spring.data.mybatis.mini.jdbc.repository.config;


import com.vonchange.jdbc.abstractjdbc.core.JdbcRepository;
import com.vonchange.jdbc.abstractjdbc.model.DataSourceWrapper;
import com.vonchange.spring.data.mybatis.mini.repository.JdbcRepositorySpringDataImpl;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

import javax.sql.DataSource;
import java.util.Optional;

/**
 * Beans that must be registered for Spring Data JDBC to work.
 *
 * @author Greg Turnquist
 * @author Jens Schauder
 * @author Mark Paluch
 * @author Michael Simons
 * @author Christoph Strobl
 */
@Configuration
public class JdbcConfiguration {


	@Bean
	public JdbcRepository initJdbcRepository(DataSource... dataSource){
		return new JdbcRepositorySpringDataImpl(dataSource);
	}

	@Bean
	public DataSourceWrapperHelper initDataSourceWrapperHelper( DataSourceWrapper... dataSourceWrapper){
		return new DataSourceWrapperHelperImpl(dataSourceWrapper);
	}
	/**
	 * Register a {@link RelationalMappingContext} and apply an optional {@link NamingStrategy}.
	 *
	 * @param namingStrategy optional {@link NamingStrategy}. Use {@link NamingStrategy#INSTANCE} as fallback.
	 * @return must not be {@literal null}.
	 *//*
	@Bean
	protected RelationalMappingContext jdbcMappingContext(Optional<NamingStrategy> namingStrategy) {

		RelationalMappingContext mappingContext = new RelationalMappingContext(
				namingStrategy.orElse(NamingStrategy.INSTANCE));
		mappingContext.setSimpleTypeHolder(jdbcCustomConversions().getSimpleTypeHolder());

		return mappingContext;
	}*/
/*
	*//**
	 * Creates a {@link RelationalConverter} using the configured {@link #jdbcMappingContext(Optional)}. Will get
	 * {@link #jdbcCustomConversions()} applied.
	 *
	 * @see #jdbcMappingContext(Optional)
	 * @see #jdbcCustomConversions()
	 * @return must not be {@literal null}.
	 *//*
	@Bean
	protected RelationalConverter relationalConverter(RelationalMappingContext mappingContext) {
		return new BasicRelationalConverter(mappingContext, jdbcCustomConversions());
	}

	*//**
	 * Register custom {@link Converter}s in a {@link JdbcCustomConversions} object if required. These
	 * {@link JdbcCustomConversions} will be registered with the {@link #relationalConverter(RelationalMappingContext)}.
	 * Returns an empty {@link JdbcCustomConversions} instance by default.
	 *
	 * @return must not be {@literal null}.
	 *//*
	@Bean
	protected JdbcCustomConversions jdbcCustomConversions() {
		return new JdbcCustomConversions();
	}*/
}
