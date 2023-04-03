package com.liferay.training.login.listener;

import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailService;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserService;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate = true,
	property = {"key=login.event.post"
		// TODO enter required service properties
	},
	service = LifecycleAction.class
)
public class PostLoginEventListener implements LifecycleAction {

	// TODO enter required service methods
	
	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) 
			throws ActionException {
		try {

			System.out.println("processLifecycleEvent()");

			User user = _userService.getCurrentUser();

			MailMessage message = new MailMessage();

			message.setSubject("Security Alert");
			message.setBody("Liferay has detected that you logged in at " + user.getLastLoginDate());

			InternetAddress toAddress = new InternetAddress(user.getEmailAddress());
			InternetAddress fromAddress = new InternetAddress("do-not-reply@liferay.com");

			message.setTo(toAddress);
			message.setFrom(fromAddress);

			_mailService.sendEmail(message);

		} catch (PortalException e) {
			e.printStackTrace();
		} catch (AddressException e) {
			e.printStackTrace();
		}
	}

	@Reference
	protected MailService _mailService;
	
	@Reference
	protected UserService _userService;

	
}
