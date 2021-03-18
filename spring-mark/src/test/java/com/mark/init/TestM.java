package com.mark.init;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

import java.util.Date;

public class TestM {
	public static void main(String[] args) {
		ConfigurableConversionService conversionService = (ConfigurableConversionService) DefaultConversionService.getSharedInstance();

		conversionService.addConverter(new Converter<Date, Long>() {

			@Override
			public Long convert(Date source) {
				return source.getTime();
			}
		});


		System.out.println(conversionService.convert(new Date(), Long.class));

	}
}
