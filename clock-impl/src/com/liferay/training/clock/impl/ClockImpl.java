package com.liferay.training.clock.impl;

import com.liferay.training.clock.api.ClockApi;

import java.util.Date;

@Component(service = ClockApi.class)
public class ClockImpl implements ClockApi {

	@Override
	public String getTime() {
		return new Date().toString();
	}

}