package com.elasticsample.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import static org.springframework.data.web.config.EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO;


/**
 * If you don’t want to change all your existing controllers to add the mapping step to return PagedModel
 * instead of Page you can enable the automatic translation of PageImpl instances into PagedModel by
 * tweaking @EnableSpringDataWebSupport as follows
 */
@Configuration
@EnableSpringDataWebSupport(pageSerializationMode = VIA_DTO)
public class PageConfiguration {
}
