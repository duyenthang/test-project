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

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_home/span_goToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on span goToCart - Navigate to page cart.png')

"Step 3: Click on button increase"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/button_increase'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on button increase.png')

"Step 4: Click on button increase"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/button_increase'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on button increase.png')

"Step 5: Click on button increase"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/button_increase'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on button increase.png')

"Step 6: Click on div cartContent"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/div_cartContent'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on div cartContent.png')

"Step 7: Click on button proceedToCheckout -> Navigate to page '/checkout/info'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/button_proceedToCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 8: Click on label emailNewsOffers"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/label_emailNewsOffers'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on label emailNewsOffers.png')

"Step 9: Click on input email"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on input email.png')

"Step 10: Click on label emailNewsOffers2"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/label_emailNewsOffers'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on label emailNewsOffers2.png')

"Step 11: Click on input email"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on input email.png')

"Step 12: Enter input value in input email"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/input_email'), input_email)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Enter input value in input email.png')

"Step 13: Click on button continueToShipping -> Navigate to page '/checkout/shipping-address'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/button_continueToShipping'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on button continueToShipping - Navigate to page checkoutshipping-address.png')

"Step 14: Click on div addressField"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/div_addressField'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on div addressField.png')

"Step 15: Enter input value in input firstName"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_firstName'), input_firstName)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Enter input value in input firstName.png')

"Step 16: Press key Tab on input firstName"

WebUI.sendKeys(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_firstName'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Press key Tab on input firstName.png')

"Step 17: Enter input value in input lastName"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_lastName'), input_lastName)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Enter input value in input lastName.png')

"Step 18: Press key Tab on input lastName"

WebUI.sendKeys(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_lastName'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Press key Tab on input lastName.png')

"Step 19: Enter input value in input shippingAddress"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_shippingAddress'), input_shippingAddress)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Enter input value in input shippingAddress.png')

"Step 20: Click on input zipCode"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_zipCode'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Click on input zipCode.png')

"Step 21: Enter input value in input zipCode"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_zipCode'), input_zipCode)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 21-Enter input value in input zipCode.png')

"Step 22: Press key Tab on input zipCode"

WebUI.sendKeys(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_zipCode'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 22-Press key Tab on input zipCode.png')

"Step 23: Enter input value in input city"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_city'), input_city)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 23-Enter input value in input city.png')

"Step 24: Press key Tab on input city"

WebUI.sendKeys(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_city'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 24-Press key Tab on input city.png')

"Step 25: Enter input value in input state"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_state'), input_state)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 25-Enter input value in input state.png')

"Step 26: Press key Tab on input state"

WebUI.sendKeys(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_state'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 26-Press key Tab on input state.png')

"Step 27: Enter input value in input phone"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_phone'), input_phone)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 27-Enter input value in input phone.png')

"Step 28: Click on button continueToPayment -> Navigate to page '/checkout/payment'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/button_continueToPayment'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 28-Click on button continueToPayment - Navigate to page checkoutpayment.png')

"Step 29: Click on button completeOrder -> Navigate to page '/thank-you/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_payment/button_completeOrder'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 29-Click on button completeOrder - Navigate to page thank-you.png')

"Step 30: Click on header thankYou"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_thank_you/header_thankYou'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 30-Click on header thankYou.png')

"Step 31: Click on link phone"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_thank_you/link_phone'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 31-Click on link phone.png')

"Step 32: Click on link apple"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_thank_you/link_apple'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 32-Click on link apple.png')

"Step 33: Click on link samsung -> Navigate to page '/category/phone-samsung'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_thank_you/link_samsung'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 33-Click on link samsung - Navigate to page categoryphone-samsung.png')

"Step 34: Click on button addToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_phone_samsung/button_addToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 34-Click on button addToCart.png')

"Step 35: Click on label colorStorageOption (colorStorageOption)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_category_phone_samsung/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_category_phone_samsung/label_colorStorageOption', ['label_colorStorageOption_internalText': label_colorStorageOption_internalText]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 35-Click on label colorStorageOption colorStorageOption.png')

"Step 36: Click on label colorStorageOption (colorStorageOption2)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_category_phone_samsung/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_category_phone_samsung/label_colorStorageOption', ['label_colorStorageOption_internalText': label_colorStorageOption_internalText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 36-Click on label colorStorageOption colorStorageOption2.png')

"Step 37: Click on button buy"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_phone_samsung/button_buy'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 37-Click on button buy.png')

"Step 38: Click on link samsungGalaxyS23Hot -> Navigate to page '/product/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_phone_samsung/link_samsungGalaxyS23Hot'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 38-Click on link samsungGalaxyS23Hot - Navigate to page product.png')

"Step 39: Click on label storageColorAndCapacity (storageColor)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColorAndCapacity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColorAndCapacity', ['label_storageColorAndCapacity_internalText': label_storageColorAndCapacity_internalText]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 39-Click on label storageColorAndCapacity storageColor.png')

"Step 40: Click on label storageColorAndCapacity (storageColor2)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColorAndCapacity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColorAndCapacity', ['label_storageColorAndCapacity_internalText': label_storageColorAndCapacity_internalText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 40-Click on label storageColorAndCapacity storageColor2.png')

"Step 41: Click on label storageColorAndCapacity (storageColor3)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColorAndCapacity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColorAndCapacity', ['label_storageColorAndCapacity_internalText': label_storageColorAndCapacity_internalText_2]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 41-Click on label storageColorAndCapacity storageColor3.png')

"Step 42: Click on button quantityControl (buy)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityControl', ['button_quantityControl_buttonTitle': button_quantityControl_buttonTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 42-Click on button quantityControl buy.png')

"Step 43: Click on span shippingIcon"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/span_shippingIcon'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 43-Click on span shippingIcon.png')

"Step 44: Click on div shippingInfo"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/div_shippingInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 44-Click on div shippingInfo.png')

"Step 45: Click on span shippingIcon2"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/span_shippingIcon2'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 45-Click on span shippingIcon2.png')

"Step 46: Click on link phone -> Navigate to page '/category/phone'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/link_phone'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 46-Click on link phone - Navigate to page categoryphone.png')

"Step 47: Click on button addToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_phone/button_addToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 47-Click on button addToCart.png')

"Step 48: Click on link placeOrder -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_phone/link_placeOrder'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 48-Click on link placeOrder - Navigate to page cart.png')

"Step 49: Click on button removeItem (remove)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_cart/button_removeItem"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_cart/button_removeItem', ['button_removeItem_nth': button_removeItem_nth]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 49-Click on button removeItem remove.png')

"Step 50: Click on span horizontalMenuElement"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/span_horizontalMenuElement'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 50-Click on span horizontalMenuElement.png')

"Step 51: Click on link samsung -> Navigate to page '/category/accessories-samsung'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/link_samsung'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 51-Click on link samsung - Navigate to page categoryaccessories-samsung.png')

"Step 52: Click on link apple -> Navigate to page '/category/phone-apple'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_accessories_samsung/link_apple'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 52-Click on link apple - Navigate to page categoryphone-apple.png')

"Step 53: Click on div productDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_phone_apple/div_productDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 53-Click on div productDetails.png')

"Step 54: Click on link iphone16 -> Navigate to page '/product/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_phone_apple/link_iphone16'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 54-Click on link iphone16 - Navigate to page product.png')

"Step 55: Click on button quantityControl (increase)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityControl', ['button_quantityControl_buttonTitle': button_quantityControl_buttonTitle_1]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 55-Click on button quantityControl increase.png')

"Step 56: Click on label storageColorAndCapacity (storage256Gb)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColorAndCapacity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColorAndCapacity', ['label_storageColorAndCapacity_internalText': label_storageColorAndCapacity_internalText_3]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 56-Click on label storageColorAndCapacity storage256Gb.png')

"Step 57: Click on label storageColorAndCapacity (colorPink)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColorAndCapacity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColorAndCapacity', ['label_storageColorAndCapacity_internalText': label_storageColorAndCapacity_internalText_4]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 57-Click on label storageColorAndCapacity colorPink.png')

"Step 58: Click on button quantityAdjustment (decrease)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityAdjustment', ['button_quantityAdjustment_buttonTitle': button_quantityAdjustment_buttonTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 58-Click on button quantityAdjustment decrease.png')

"Step 59: Click on link productThumbnail (productThumbnailIPhone16)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/link_productThumbnail"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/link_productThumbnail', ['link_productThumbnail_liNthChild': link_productThumbnail_liNthChild]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 59-Click on link productThumbnail productThumbnailIPhone16.png')

"Step 60: Click on link productThumbnail (iphone16Thumbnail)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/link_productThumbnail"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/link_productThumbnail', ['link_productThumbnail_liNthChild': link_productThumbnail_liNthChild_1]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 60-Click on link productThumbnail iphone16Thumbnail.png')

"Step 61: Click on list productGalleryThumbs"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/list_productGalleryThumbs'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 61-Click on list productGalleryThumbs.png')

"Step 62: Click on button quantityAdjustment (increase2)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityAdjustment"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityAdjustment', ['button_quantityAdjustment_buttonTitle': button_quantityAdjustment_buttonTitle_1]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 62-Click on button quantityAdjustment increase2.png')

"Step 63: Click on label storageColorAndCapacity (storage512Gb)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColorAndCapacity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColorAndCapacity', ['label_storageColorAndCapacity_internalText': label_storageColorAndCapacity_internalText_5]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 63-Click on label storageColorAndCapacity storage512Gb.png')

"Step 64: Click on button quantityControl (buy)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityControl', ['button_quantityControl_buttonTitle': button_quantityControl_buttonTitle_2]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 64-Click on button quantityControl buy.png')

"Step 65: Click on div productAddedMessage"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/div_productAddedMessage'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 65-Click on div productAddedMessage.png')

"Step 66: Click on button action"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/button_action'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 66-Click on button action.png')

"Step 67: Click on span horizontalMenuElement"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/span_horizontalMenuElement'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 67-Click on span horizontalMenuElement.png')

"Step 68: Click on link samsung -> Navigate to page '/category/accessories-samsung'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/link_samsung'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 68-Click on link samsung - Navigate to page categoryaccessories-samsung.png')

"Step 69: Click on input priceMin"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_accessories_samsung/input_priceMin'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 69-Click on input priceMin.png')

"Step 70: Click on label inStock"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_accessories_samsung/label_inStock'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 70-Click on label inStock.png')

"Step 71: Click on input priceMin"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_accessories_samsung/input_priceMin'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 71-Click on input priceMin.png')

"Step 72: Click on button showMore"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_accessories_samsung/button_showMore'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 72-Click on button showMore.png')

"Step 73: Click on div clearSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_accessories_samsung/div_clearSearch'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 73-Click on div clearSearch.png')

"Step 74: Click on button addToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_accessories_samsung/button_addToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 74-Click on button addToCart.png')

"Step 75: Click on link placeOrder -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_accessories_samsung/link_placeOrder'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 75-Click on link placeOrder - Navigate to page cart.png')

"Step 76: Click on button removeItem (remove2)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_cart/button_removeItem"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_cart/button_removeItem', ['button_removeItem_nth': button_removeItem_nth_1]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 76-Click on button removeItem remove2.png')

"Step 77: Click on button removeItem (remove)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_cart/button_removeItem"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_cart/button_removeItem', ['button_removeItem_nth': button_removeItem_nth_2]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 77-Click on button removeItem remove.png')

"Step 78: Click on button proceedToCheckout -> Navigate to page '/checkout/info'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_cart/button_proceedToCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 78-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 79: Click on div contactInformation"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/div_contactInformation'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 79-Click on div contactInformation.png')

"Step 80: Click on input email"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 80-Click on input email.png')

"Step 81: Enter input value in input email"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/input_email'), input_email_1)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 81-Enter input value in input email.png')

"Step 82: Click on button continueToShipping -> Navigate to page '/checkout/shipping-address'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_info/button_continueToShipping'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 82-Click on button continueToShipping - Navigate to page checkoutshipping-address.png')

"Step 83: Click on input firstName"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_firstName'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 83-Click on input firstName.png')

"Step 84: Enter input value in input firstName"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_firstName'), input_firstName_1)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 84-Enter input value in input firstName.png')

"Step 85: Click on input lastName"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_lastName'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 85-Click on input lastName.png')

"Step 86: Enter input value in input lastName"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_lastName'), input_lastName_1)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 86-Enter input value in input lastName.png')

"Step 87: Click on input shippingAddress"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_shippingAddress'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 87-Click on input shippingAddress.png')

"Step 88: Enter input value in input shippingAddress"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_shippingAddress'), input_shippingAddress_1)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 88-Enter input value in input shippingAddress.png')

"Step 89: Click on input zipCode"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_zipCode'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 89-Click on input zipCode.png')

"Step 90: Enter input value in input zipCode"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_zipCode'), input_zipCode_1)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 90-Enter input value in input zipCode.png')

"Step 91: Click on input city"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_city'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 91-Click on input city.png')

"Step 92: Enter input value in input city"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_city'), input_city_1)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 92-Enter input value in input city.png')

"Step 93: Click on input state"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_state'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 93-Click on input state.png')

"Step 94: Enter input value in input state"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_state'), input_state_1)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 94-Enter input value in input state.png')

"Step 95: Click on input phone"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_phone'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 95-Click on input phone.png')

"Step 96: Enter input value in input phone"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/input_phone'), input_phone_1)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 96-Enter input value in input phone.png')

"Step 97: Click on form checkoutShippingAddress"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/form_checkoutShippingAddress'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 97-Click on form checkoutShippingAddress.png')

"Step 98: Click on button continueToPayment -> Navigate to page '/checkout/payment'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_shipping_address/button_continueToPayment'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 98-Click on button continueToPayment - Navigate to page checkoutpayment.png')

"Step 99: Click on span paymentIcon -> Navigate to page '/thank-you/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_checkout_payment/span_paymentIcon'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 99-Click on span paymentIcon - Navigate to page thank-you.png')

"Step 100: Click on div welcomeMessage"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_thank_you/div_welcomeMessage'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 100-Click on div welcomeMessage.png')

"Step 101: Click on link kCellphoneShop -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_thank_you/link_kCellphoneShop'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 101-Click on link kCellphoneShop - Navigate to page .png')

"Step 102: Click on div welcomeMessage"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_home/div_welcomeMessage'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 102-Click on div welcomeMessage.png')

"Step 103: Click on link googlePixel -> Navigate to page '/category/phone-google-pixel'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_home/link_googlePixel'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 103-Click on link googlePixel - Navigate to page categoryphone-google-pixel.png')

"Step 104: Click on item productImage -> Navigate to page '/product/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_category_phone_google_pixel/item_productImage'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 104-Click on item productImage - Navigate to page product.png')

"Step 105: Click on label storageColorAndCapacity (storage256Gb2)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColorAndCapacity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColorAndCapacity', ['label_storageColorAndCapacity_internalText': label_storageColorAndCapacity_internalText_6]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 105-Click on label storageColorAndCapacity storage256Gb2.png')

"Step 106: Click on button quantityControl (decrease2)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityControl', ['button_quantityControl_buttonTitle': button_quantityControl_buttonTitle_3]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 106-Click on button quantityControl decrease2.png')

"Step 107: Click on input quantity"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/input_quantity'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 107-Click on input quantity.png')

"Step 108: Click on input quantity"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/input_quantity'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 108-Click on input quantity.png')

"Step 109: Click on input quantity"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/input_quantity'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 109-Click on input quantity.png')

"Step 110: Click on input quantity"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/input_quantity'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 110-Click on input quantity.png')

"Step 111: Click on input quantity"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/input_quantity'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 111-Click on input quantity.png')

"Step 112: Enter input value in input quantity"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_product/input_quantity'), input_quantity)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 112-Enter input value in input quantity.png')

"Step 113: Click on button quantityControl (increase)"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/button_quantityControl', ['button_quantityControl_buttonTitle': button_quantityControl_buttonTitle_4]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 113-Click on button quantityControl increase.png')

"Step 114: Click on div priceAndBuy"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/div_priceAndBuy'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 114-Click on div priceAndBuy.png')

"Step 115: Click on input quantity"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/input_quantity'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 115-Click on input quantity.png')

"Step 116: Enter input value in input quantity"

WebUI.setText(findTestObject('AI-Generated/Dev Test Env/Page_product/input_quantity'), input_quantity_1)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 116-Enter input value in input quantity.png')

"Step 117: Click on p discountMessage"

WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Page_product/p_discountMessage'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 117-Click on p discountMessage.png')

"Step 118: Click on label storageColorAndCapacity (porcelain) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColorAndCapacity"
WebUI.enhancedClick(findTestObject('AI-Generated/Dev Test Env/Dynamic Objects/Page_product/label_storageColorAndCapacity', ['label_storageColorAndCapacity_internalText': label_storageColorAndCapacity_internalText_7]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 118-Click on label storageColorAndCapacity porcelain - Navigate to page .png')

"Step 119: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Comprehensive Shopping Cart and Checkout Process with Multiple Products_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}