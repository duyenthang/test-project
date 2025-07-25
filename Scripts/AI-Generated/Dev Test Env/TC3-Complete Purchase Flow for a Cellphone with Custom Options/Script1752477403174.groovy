import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Dev_Test_Env.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /product/*"

TrueTestScripts.navigate("/product/${product_id}")

"Step 2: Click on label colorAndStorageOptions (pink)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_colorAndStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_colorAndStorageOptions', ['label_colorAndStorageOptions_internalText': label_colorAndStorageOptions_internalText]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on label colorAndStorageOptions pink.png')

"Step 3: Click on link kCellphoneShop"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/link_kCellphoneShop'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link kCellphoneShop.png')

"Step 4: Click on label colorAndStorageOptions (green)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_colorAndStorageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_colorAndStorageOptions', ['label_colorAndStorageOptions_internalText': label_colorAndStorageOptions_internalText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on label colorAndStorageOptions green.png')

"Step 5: Click on div priceAndBuy"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/div_priceAndBuy'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on div priceAndBuy.png')

"Step 6: Click on button quantityAdjustment (quantityAdjustment)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityAdjustment', ['button_quantityAdjustment_buttonTitle': button_quantityAdjustment_buttonTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on button quantityAdjustment quantityAdjustment.png')

"Step 7: Click on button quantityControl (quantityControl)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityControl', ['button_quantityControl_buttonTitle': button_quantityControl_buttonTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on button quantityControl quantityControl.png')

"Step 8: Click on button quantityControl (quantityControl)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityControl', ['button_quantityControl_buttonTitle': button_quantityControl_buttonTitle_1]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on button quantityControl quantityControl.png')

"Step 9: Click on button quantityAdjustment (quantityAdjustment2)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityAdjustment', ['button_quantityAdjustment_buttonTitle': button_quantityAdjustment_buttonTitle_1]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on button quantityAdjustment quantityAdjustment2.png')

"Step 10: Click on button quantityControl (quantityControl)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityControl', ['button_quantityControl_buttonTitle': button_quantityControl_buttonTitle_2]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on button quantityControl quantityControl.png')

"Step 11: Click on link goToCart -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/link_goToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on link goToCart - Navigate to page cart.png')

"Step 12: Click on link goShopping -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/link_goShopping'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on link goShopping - Navigate to page .png')

"Step 13: Click on button addToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_home/button_addToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on button addToCart.png')

"Step 14: Click on link placeOrder -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_home/link_placeOrder'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on link placeOrder - Navigate to page cart.png')

"Step 15: Click on button proceedToCheckout -> Navigate to page '/checkout/info'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/button_proceedToCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 16: Click on input email"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Click on input email.png')

"Step 17: Enter input value in input email"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/input_email'), input_email)

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Enter input value in input email.png')

"Step 18: Click on button continueToShipping -> Navigate to page '/checkout/shipping-address'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/button_continueToShipping'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 18-Click on button continueToShipping - Navigate to page checkoutshipping-address.png')

"Step 19: Click on input firstName"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_firstName'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 19-Click on input firstName.png')

"Step 20: Click on input lastName"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_lastName'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 20-Click on input lastName.png')

"Step 21: Enter input value in input lastName"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_lastName'), input_lastName)

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 21-Enter input value in input lastName.png')

"Step 22: Click on div firstName"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/div_firstName'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 22-Click on div firstName.png')

"Step 23: Click on input firstName"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_firstName'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 23-Click on input firstName.png')

"Step 24: Enter input value in input firstName"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_firstName'), input_firstName)

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 24-Enter input value in input firstName.png')

"Step 25: Click on div address"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/div_address'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 25-Click on div address.png')

"Step 26: Click on div zipCode"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/div_zipCode'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 26-Click on div zipCode.png')

"Step 27: Click on input shippingAddress"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_shippingAddress'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 27-Click on input shippingAddress.png')

"Step 28: Enter input value in input shippingAddress"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_shippingAddress'), input_shippingAddress)

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 28-Enter input value in input shippingAddress.png')

"Step 29: Click on div zipCode2"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/div_zipCode2'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 29-Click on div zipCode2.png')

"Step 30: Click on input zipCode"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_zipCode'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 30-Click on input zipCode.png')

"Step 31: Enter input value in input zipCode"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_zipCode'), input_zipCode)

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 31-Enter input value in input zipCode.png')

"Step 32: Click on input state"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_state'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 32-Click on input state.png')

"Step 33: Enter input value in input state"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_state'), input_state)

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 33-Enter input value in input state.png')

"Step 34: Click on input city"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_city'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 34-Click on input city.png')

"Step 35: Enter input value in input city"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_city'), input_city)

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 35-Enter input value in input city.png')

"Step 36: Click on input phone"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_phone'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 36-Click on input phone.png')

"Step 37: Enter input value in input phone"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_phone'), input_phone)

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 37-Enter input value in input phone.png')

"Step 38: Click on button continueToPayment -> Navigate to page '/checkout/payment'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/button_continueToPayment'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 38-Click on button continueToPayment - Navigate to page checkoutpayment.png')

"Step 39: Click on button completeOrder -> Navigate to page '/thank-you/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_payment/button_completeOrder'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 39-Click on button completeOrder - Navigate to page thank-you.png')

"Step 40: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Complete Purchase Flow for a Cellphone with Custom Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}