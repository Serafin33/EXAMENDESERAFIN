package context;


import java.awt.Dimension;


import data.models.Product;
import i18n.TextCodes;
import i18n.Translations;
import ui.custom.BaseWindow;
import ui.custom.ButtonComponent;
import ui.custom.PanelBox;
import ui.custom.TextFieldComponent;

public class RegisterFormProduct extends BaseWindow{
    private TextFieldComponent nameField;
    private TextFieldComponent descriptionField;
    private TextFieldComponent typeField;
    private  TextFieldComponent priceField;
    private ButtonComponent registerButton;
    private Translations lang;
    private PanelBox panel;
    public RegisterFormProduct(Translations lang, String title) {
        super(title);
        this.lang = lang;
        this.setSize(new Dimension(350, 400));
        
        createForm();
    }
    public void createForm() {
        panel = new PanelBox();
        panel.setSize(new Dimension(350, 400));
        panel.roundedBorder(20);
        panel.setLayout(null);
        
        nameField = new TextFieldComponent(lang.getI18nText(TextCodes.productNameTextField), this.panel);
        nameField.setPosition(40);
        nameField.setSize(new Dimension(260, 40));
        nameField.setPlaceHolder(lang.getI18nText(TextCodes.productNameTextField));
        this.panel.add(nameField);

        descriptionField = new TextFieldComponent(lang.getI18nText(TextCodes.productDescriptionTextField), this.panel);
        descriptionField.setPosition(80);
        descriptionField.setSize(new Dimension(260, 40));
        descriptionField.setPlaceHolder(lang.getI18nText(TextCodes.productDescriptionTextField));
        this.panel.add(descriptionField);

        typeField = new TextFieldComponent(lang.getI18nText(TextCodes.productTypeTextField), this.panel);
        typeField.setPosition(120);
        typeField.setSize(new Dimension(260, 40));
		typeField.setPlaceHolder(lang.getI18nText(TextCodes.productTypeTextField));
        this.panel.add(typeField);

        priceField = new TextFieldComponent(lang.getI18nText(TextCodes.productPriceTextField), this.panel);
        priceField.setPosition(160);
        priceField.setSize(new Dimension(260, 40));
        priceField.setPlaceHolder(lang.getI18nText(TextCodes.productPriceTextField));
        this.panel.add(priceField);

        registerButton = new ButtonComponent(lang.getI18nText(TextCodes.registerProductText), this.panel);
        registerButton.setPosition(200);
        registerButton.setSize(new Dimension(260, 40));
        registerButton.addActionListener((event) -> {
            Product product = new Product(this.nameField.getText(), this.descriptionField.getText(), this.typeField.getText(), this.priceField.getText());
			System.out.println("Button");
			System.out.println(product);
           this.getListener().onEvent("click-register-product", product); 
		   System.out.println("clicked!");
        });
        this.panel.add(registerButton);
        this.add(this.panel);
    }
}
