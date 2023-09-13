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

Mobile.tap(findTestObject('Login/btn_CreateAProfile'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Create Profile/txt_CreateProfile'), 'Create Profile')

Mobile.verifyElementVisible(findTestObject('Object Repository/Create Profile/input_FirstName'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Create Profile/input_LastName'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Create Profile/input_Country'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Create Profile/input_CreateUsername'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Create Profile/input_CreatePassword'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Create Profile/input_ConfirmPassword'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Create Profile/btn_CreateProfile'), 0)

Mobile.setText(findTestObject('Create Profile/input_FirstName'), GlobalVariable.firstName, 0)

Mobile.setText(findTestObject('Create Profile/input_LastName'), GlobalVariable.lastName, 0)

Mobile.setText(findTestObject('Create Profile/input_Country'), GlobalVariable.country, 0)

Mobile.setText(findTestObject('Create Profile/input_CreateUsername'), GlobalVariable.firstName + GlobalVariable.lastName, 
    0)

Mobile.setText(findTestObject('Create Profile/input_CreatePassword'), GlobalVariable.password, 0)

Mobile.setText(findTestObject('Create Profile/input_ConfirmPassword'), GlobalVariable.confrimPassword, 0)

Mobile.tap(findTestObject('Create Profile/btn_CreateProfile'), 0)

