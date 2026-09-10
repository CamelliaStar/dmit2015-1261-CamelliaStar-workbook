package view;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import jakarta.validation.constraints.NotBlank;

@Named
@RequestScoped
public class HelloBean {

    @NotBlank(message = "User input value is required")
    private String userInput;

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public String getMessage() {
        return String.format("Hello, %s", userInput);
    }

    public String onSubmit() {
        FacesContext.getCurrentInstance()
                .addMessage(null,new FacesMessage("FacesMessage:" + userInput));
        userInput = null;
        return null;
    }

    public String onToHelloJsp() {
        return "/index.jsp";
    }
}
