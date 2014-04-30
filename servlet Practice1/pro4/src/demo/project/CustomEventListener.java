package demo.project;

import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

class CustomEventListener implements HttpSessionBindingListener {
	
	ServletContext context;
	
	CustomEventListener(ServletContext context)
	{
	  this.context = context;	
	}
	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		context.log("["+new Date()+"] Bound as"+arg0.getName()+"to"+arg0.getSession().getId());
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		context.log("["+new Date()+"] Unbound as"+arg0.getName()+"from"+arg0.getSession().getId());
		

	}

}
