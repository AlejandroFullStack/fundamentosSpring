package com.fundamentos.sprinboot.fundamentos;

import com.fundamentos.sprinboot.fundamentos.bean.MyBean;
import com.fundamentos.sprinboot.fundamentos.bean.MyBeanImplement;
import com.fundamentos.sprinboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.sprinboot.fundamentos.bean.MyNotificacion;
import com.fundamentos.sprinboot.fundamentos.components.ComponentDependency;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;
	private MyNotificacion myNotificacion;

	public FundamentosApplication(ComponentDependency componentDependency,
								  MyBean myBean,
								  MyBeanWithDependency myBeanWithDependency,
								  MyNotificacion myNotificacion ){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
		this.myNotificacion = myNotificacion;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
		myNotificacion.notificaction();
	}
}
