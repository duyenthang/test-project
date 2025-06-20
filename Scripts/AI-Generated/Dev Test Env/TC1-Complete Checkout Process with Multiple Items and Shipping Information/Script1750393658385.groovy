import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Dev_Test_Env.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on span goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_home/span_goToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on span goToCart - Navigate to page cart.png')

"Step 3: Click on button increase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/button_increase'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on button increase.png')

"Step 4: Click on button increase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/button_increase'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button increase.png')

"Step 5: Click on button increase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/button_increase'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on button increase.png')

"Step 6: Click on div cartContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/div_cartContent'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on div cartContent.png')

"Step 7: Click on button proceedToCheckout -> Navigate to page '/checkout/info'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/button_proceedToCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 8: Click on label emailNewsOffers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/label_emailNewsOffers'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on label emailNewsOffers.png')

"Step 9: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on input email.png')

"Step 10: Click on label emailNewsOffers2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/label_emailNewsOffers'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on label emailNewsOffers2.png')

"Step 11: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on input email.png')

"Step 12: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/input_email'), input_email)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Enter input value in input email.png')

"Step 13: Click on button continueToShipping -> Navigate to page '/checkout/shipping-address'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/button_continueToShipping'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on button continueToShipping - Navigate to page checkoutshipping-address.png')

"Step 14: Click on div addressField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/div_addressField'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on div addressField.png')

"Step 15: Enter input value in input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_firstName'), input_firstName)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Enter input value in input firstName.png')

"Step 16: Press key Tab on input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_firstName'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Press key Tab on input firstName.png')

"Step 17: Enter input value in input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_lastName'), input_lastName)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Enter input value in input lastName.png')

"Step 18: Press key Tab on input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_lastName'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Press key Tab on input lastName.png')

"Step 19: Enter input value in input shippingAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_shippingAddress'), input_shippingAddress)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Enter input value in input shippingAddress.png')

"Step 20: Click on input zipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_zipCode'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on input zipCode.png')

"Step 21: Enter input value in input zipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_zipCode'), input_zipCode)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Enter input value in input zipCode.png')

"Step 22: Press key Tab on input zipCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_zipCode'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Press key Tab on input zipCode.png')

"Step 23: Enter input value in input city"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_city'), input_city)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Enter input value in input city.png')

"Step 24: Press key Tab on input city"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_city'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Press key Tab on input city.png')

"Step 25: Enter input value in input state"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_state'), input_state)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Enter input value in input state.png')

"Step 26: Press key Tab on input state"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_state'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Press key Tab on input state.png')

"Step 27: Enter input value in input phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_phone'), input_phone)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Enter input value in input phone.png')

"Step 28: Click on button continueToPayment -> Navigate to page '/checkout/payment'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/button_continueToPayment'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Click on button continueToPayment - Navigate to page checkoutpayment.png')

"Step 29: Click on button completeOrder -> Navigate to page '/thank-you/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_payment/button_completeOrder'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Click on button completeOrder - Navigate to page thank-you.png')

"Step 30: Click on header thankYou"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_thank_you/header_thankYou'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Click on header thankYou.png')

"Step 31: Click on link phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_thank_you/link_phone'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 31-Click on link phone.png')

"Step 32: Click on link apple"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_thank_you/link_apple'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Click on link apple.png')

"Step 33: Click on link samsung -> Navigate to page '/category/phone-samsung'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_thank_you/link_samsung'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Click on link samsung - Navigate to page categoryphone-samsung.png')

"Step 34: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/phone-samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_phone_samsung/button_addToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 34-Click on button addToCart.png')

"Step 35: Click on label colorStorageOption (mint)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/phone-samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_category_phone_samsung/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_category_phone_samsung/label_colorStorageOption', ['label_colorStorageOption_internalText': label_colorStorageOption_internalText]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 35-Click on label colorStorageOption mint.png')

"Step 36: Click on label colorStorageOption ( 512Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/phone-samsung?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_category_phone_samsung/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_category_phone_samsung/label_colorStorageOption', ['label_colorStorageOption_internalText': label_colorStorageOption_internalText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 36-Click on label colorStorageOption  512Gb.png')

"Step 37: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/phone-samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_phone_samsung/button_buy'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 37-Click on button buy.png')

"Step 38: Click on link samsungGalaxyS23Hot -> Navigate to page '/product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/phone-samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_phone_samsung/link_samsungGalaxyS23Hot'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 38-Click on link samsungGalaxyS23Hot - Navigate to page product.png')

"Step 39: Click on label storageColor (yellow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColor', ['label_storageColor_internalText': label_storageColor_internalText]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 39-Click on label storageColor yellow.png')

"Step 40: Click on label storageColor (white)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColor', ['label_storageColor_internalText': label_storageColor_internalText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 40-Click on label storageColor white.png')

"Step 41: Click on label storageColor (storage512Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColor', ['label_storageColor_internalText': label_storageColor_internalText_2]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 41-Click on label storageColor storage512Gb.png')

"Step 42: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/button_buy'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 42-Click on button buy.png')

"Step 43: Click on span shippingIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/span_shippingIcon'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 43-Click on span shippingIcon.png')

"Step 44: Click on div shippingInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/div_shippingInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 44-Click on div shippingInfo.png')

"Step 45: Click on span shippingIcon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/span_shippingIcon2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 45-Click on span shippingIcon2.png')

"Step 46: Click on link phone -> Navigate to page '/category/phone'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/link_phone'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 46-Click on link phone - Navigate to page categoryphone.png')

"Step 47: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/phone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_phone/button_addToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 47-Click on button addToCart.png')

"Step 48: Click on link placeOrder -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/phone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_phone/link_placeOrder'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 48-Click on link placeOrder - Navigate to page cart.png')

"Step 49: Click on button remove"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/button_remove'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 49-Click on button remove.png')

"Step 50: Click on span horizontalMenuElement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/span_horizontalMenuElement'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 50-Click on span horizontalMenuElement.png')

"Step 51: Click on link samsung -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/link_samsung'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 51-Click on link samsung - Navigate to page .png')

"Step 52: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Checkout Process with Multiple Items and Shipping Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}