package com.fundamentos.sprinboot.fundamentos;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.fundamentos.sprinboot.fundamentos.bean.MyBean;
import com.fundamentos.sprinboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.sprinboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.sprinboot.fundamentos.bean.MyNotificacion;
import com.fundamentos.sprinboot.fundamentos.components.ComponentDependency;
import com.fundamentos.sprinboot.fundamentos.pojo.UserPojo;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private  final Log LOGGER = LogFactory.getLog(FundamentosApplication.class);

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;
	private MyNotificacion myNotificacion;
	private UserPojo userPojo;
	private MyBeanWithProperties myBeanWithProperties;
	public FundamentosApplication(ComponentDependency componentDependency,
								  MyBean myBean,
								  MyBeanWithDependency myBeanWithDependency,
								  MyNotificacion myNotificacion,
								  UserPojo userPojo,
								  MyBeanWithProperties myBeanWithProperties){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
		this.myNotificacion = myNotificacion;
		this.userPojo = userPojo;
		this.myBeanWithProperties = myBeanWithProperties;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {

			/* */
			Random rand = new Random();
			// Generate random integers in range 0 to 1
			int rand_int1 = rand.nextInt(2);
			if (rand_int1>0) {
				LOGGER.debug("Mi valor " + rand_int1);
			}
			else {
				LOGGER.debug("Mi valor " + rand_int1);
				int value = 10/rand_int1;
			}


			componentDependency.saludar();
			myBean.print();
			myBeanWithDependency.printWithDependency();
			myNotificacion.notificaction();
			System.out.println("Bean con propiedades @value() -> value");
			System.out.println(myBeanWithProperties.function());
			System.out.println("UserPojo con prefijo 'User'");
			System.out.println(userPojo.getNombre() + " - " + userPojo.getEmail() );

		} catch(Exception e) {
			LOGGER.error("Esto es un error al dividir por cero");
		}

	}
}
