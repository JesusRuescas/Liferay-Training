package com.liferay.training.osgi.service;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

@Component(
		service = ClockApi.class
		)
public class ClockImpl implements ClockApi {

	@Override
	public String getTime() {
		return new Date().toString();
	}
	
}
