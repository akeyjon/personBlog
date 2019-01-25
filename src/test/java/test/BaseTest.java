/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019，所有权利保留。
 * 
 * 项目名：	personBlog
 * 文件名：	BaseTest.java
 * 模块说明：	
 * 修改历史：
 * 2019年1月25日 - dailongwen - 创建。
 */
package test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cn.MyApplication;


/**
 * @author dailongwen
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
@WebAppConfiguration 
public class BaseTest {

}
