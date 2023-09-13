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

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Login/btn_Login'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.TextView - Dashboard'), 'Dashboard')

Mobile.verifyElementVisible(findTestObject('Object Repository/Object Create/android.widget.ImageView (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.TextView - You do not have any accounts, click below to add an account'), 
    'You do not have any accounts, click below to add an account')

Mobile.verifyElementVisible(findTestObject('Object Repository/Object Create/android.widget.Button - ADD ACCOUNT'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.TextView - Add an Account'), 'Add an Account')

Mobile.verifyElementVisible(findTestObject('Object Repository/Object Create/android.widget.EditText - Account Name'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Object Create/android.widget.EditText - Initial Balance (Optional)'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.Button - CANCEL'), 'CANCEL')

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.Button - ADD'), 'ADD')

Mobile.setText(findTestObject(''), 'drina', 0)

Mobile.setText(findTestObject(''), '1000', 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Object Create/android.widget.ImageButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.TextView - aaa aaa'), 'aaa aaa')

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.TextView - aaa'), 'aaa')

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.CheckedTextView - Dashboard'), 'Dashboard')

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.CheckedTextView - Accounts'), 'Accounts')

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.TextView - Transaction'), 'Transaction')

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.CheckedTextView - Make a Deposit'), 
    'Make a Deposit')

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.CheckedTextView - Make a Transfer'), 
    'Make a Transfer')

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.CheckedTextView - Make a Payment'), 
    'Make a Payment')

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.TextView - Profile'), 'Profile')

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.CheckedTextView - Settings'), 'Settings')

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.CheckedTextView - Logout'), 'Logout')

Mobile.tap(findTestObject(''), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.TextView - Payment'), 'Payment')

Mobile.verifyElementText(findTestObject('Object Repository/Object Create/android.widget.TextView - Select an Account to Pay from'), 
    'Select an Account to Pay from')

Mobile.closeApplication()

