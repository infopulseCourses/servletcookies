package com.courses.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;

/**
 * @author Stepan
 */
public class WelcomeHandler extends BodyTagSupport {

    private String name;
    private String body;


    public void setName(String name){
        this.name = name;
    }

    @Override
    public int doEndTag() throws JspException {
        JspWriter writer = pageContext.getOut();
        try {
            writer.print(body);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return BodyTagSupport.EVAL_PAGE;
    }

    @Override
    public void doInitBody() throws JspException {
        super.doInitBody();
    }

    @Override
    public int doAfterBody() throws JspException {
        BodyContent bodyContent = super.getBodyContent();
        body = bodyContent.getString();

        return super.doAfterBody();
    }

    @Override
    public int doStartTag() throws JspException {


        return BodyTagSupport.EVAL_BODY_BUFFERED;
    }
}
