import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String nowDate = new Date().format('EEEE')

String nama = GlobalVariable.firstName

Mobile.callTestCase(findTestCase('Create an Account'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/btn_Login'), 0)

/*Mobile.verifyElementText(findTestObject('Create Account/android.widget.TextView - Good afternoon,' +nama+ '. Welcome to the Bank App Demo. Happy '+nowDate+''), 
    ('Good afternoon,' + GlobalVariable.firstName) + ' . Welcome to the Bank App Demo. Happy Tuesday.')
Mobile.verifyElementText(findTestObject('Object Repository/Create Account/android.widget.TextView - You do not have any accounts, click below to add an account'), 
    'You do not have any accounts, click below to add an account')*/
if (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Create Account/btn_AddAccount'), 0, FailureHandling.CONTINUE_ON_FAILURE)) {
    Mobile.tap(findTestObject('Object Create/btn_burgerMenu'), 0)

    Mobile.tap(findTestObject('Object Create/btn_MakeAPayment'), 0)
} else {
    Mobile.tap(findTestObject('Object Repository/Create Account/btn_AddAccount'), 0)

    Mobile.verifyElementText(findTestObject('Object Repository/Create Account/txt_AddAnAccount'), 'Add an Account')

    Mobile.verifyElementVisible(findTestObject('Object Repository/Create Account/input_AccountName'), 0)

    Mobile.setText(findTestObject('Object Repository/Create Account/input_AccountName'), GlobalVariable.accName, 0)

    Mobile.verifyElementVisible(findTestObject('Object Repository/Create Account/input_InitialBalance'), 0)

    Mobile.setText(findTestObject('Object Repository/Create Account/input_InitialBalance'), GlobalVariable.initialBalance, 
        0)

    Mobile.verifyElementVisible(findTestObject('Object Repository/Create Account/btn_Cancel'), 0)

    Mobile.verifyElementVisible(findTestObject('Object Repository/Create Account/btn_Add'), 0)

    Mobile.tap(findTestObject('Object Repository/Create Account/btn_Add'), 0)
}

Mobile.tap(findTestObject('Object Create/btn_burgerMenu'), 0)

Mobile.tap(findTestObject('Object Create/btn_MakeAPayment'), 0)

Mobile.verifyElementText(findTestObject('Object Create/txt_Select an Account to Pay from'), '')

Mobile.tap(findTestObject('Object Create/btn_burgerMenu'), 0)

Mobile.tap(findTestObject('Object Create/btn_Logout'), 0)

