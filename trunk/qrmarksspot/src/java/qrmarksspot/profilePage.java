/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qrmarksspot;

import Classes.GameAttributes;
import Classes.MySqlConnection;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.model.DefaultOptionsList;
import com.sun.webui.jsf.model.MultipleSelectOptionsList;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import java.util.Date;
import javax.faces.FacesException;
import javax.faces.event.ValueChangeEvent;
/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version profilePage.java
 * @version Created on 27.Kas.2011, 17:21:10
 * @author 23
 */

public class profilePage extends AbstractPageBean {
    public String userName1="nightsurfer23";
    public String dateOfBirth="17.03.1989";
    public String location="İzmir";
    public String nameSurname="Ibrahim Çimentepe";
    public String faceAccount="ibrahim.cimentepe@facebook.com";

    public String getFaceAccount() {
        return faceAccount;
    }

    public void setFaceAccount(String faceAccount) {
        this.faceAccount = faceAccount;
    }

    public String getTwitterAccount() {
        return twitterAccount;
    }

    public void setTwitterAccount(String twitterAccount) {
        this.twitterAccount = twitterAccount;
    }
    public String twitterAccount="ibrahim.cimentepe@twitter.com";

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUserName1() {
        return userName1;
    }

    public void setUserName1(String userName1) {
        this.userName1 = userName1;
    }
    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    private DefaultOptionsList gameListDefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getGameListDefaultOptions() {
        return gameListDefaultOptions;
    }

    public void setGameListDefaultOptions(DefaultOptionsList dol) {
        this.gameListDefaultOptions = dol;
    }
    private DefaultOptionsList listbox1DefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getListbox1DefaultOptions() {
        return listbox1DefaultOptions;
    }

    public void setListbox1DefaultOptions(DefaultOptionsList dol) {
        this.listbox1DefaultOptions = dol;
    }

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public profilePage() {

    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    @Override
    public void init() {
        this.userName1=         "nightsurfer23";
        this.dateOfBirth=       "17.03.1989";
        this.location=          "İzmir";
        this.nameSurname=       "Ibrahim Çimentepe";
        this.faceAccount=       "ibrahim.cimentepe@facebook.com";
        this.twitterAccount=    "ibrahim.cimentepe@twitter.com";
        

        // Perform initializations inherited from our superclass
        
        
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            init();
            //_init();
        } catch (Exception e) {
            log("profilePage Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }
    public void textField1_processValueChange(ValueChangeEvent vce) {
    }

    public String editButton_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() {
        gameListDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("item1", "Game 1"), new com.sun.webui.jsf.model.Option("item2", "Game 2"), new com.sun.webui.jsf.model.Option("item3", "Game 3")});
    }

    public String homePageButton_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "homepage";
    }

    public String signOutButton_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "login";
    }



    public String playGame_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "play";
    }


    public String button2_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "success";
    }


    
}

