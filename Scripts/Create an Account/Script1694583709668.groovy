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

Mobile.verifyElementText(findTestObject('Object Repository/Create Account/txt_dashboard'), 'Dashboard')

Mobile.verifyElementVisible(findTestObject('Object Repository/Create Account/img_Logo'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Create Account/txt_You do not have any accounts, click below to add an account'), 
    'You do not have any accounts, click below to add an account')

Mobile.verifyElementVisible(findTestObject('Object Repository/Create Account/btn_AddAccount'), 0)

Mobile.tap(findTestObject('Create Account/btn_AddAccount'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Side Bar Menu/txt_Add an Account'), 'Add an Account')

Mobile.verifyElementVisible(findTestObject('Object Repository/Create Account/input_AccountName'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Create Account/Input_InitialBalance'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Create Account/btn_Cancel'), 'CANCEL')

Mobile.verifyElementText(findTestObject('Object Repository/Create Account/btn_Add'), 'ADD')

Mobile.setText(findTestObject('Create Account/input_AccountName'), GlobalVariable.accName, 0)

Mobile.setText(findTestObject('Create Account/Input_InitialBalance'), GlobalVariable.initialBalance, 0)

Mobile.tap(findTestObject('Create Account/btn_Add'), 0)

Mobile.tap(findTestObject('Side Bar Menu/btn_burgerMenu'), 0)

Mobile.tap(findTestObject('Side Bar Menu/btn_Logout'), 0)

