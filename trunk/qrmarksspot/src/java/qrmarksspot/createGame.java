/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qrmarksspot;

import Classes.GameAttributes;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.model.DefaultOptionsList;
import com.sun.webui.jsf.model.MultipleSelectOptionsList;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import javax.faces.FacesException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version createGame.java
 * @version Created on Nov 25, 2011, 4:46:35 AM
 * @author alke
 */

public class createGame extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    // </editor-fold>

    String GameName;
    String Description;
    String StartingPoint;
    String Borders;
    String Tag1;
    String Tag2;
    String Tag3;
    String Tag4;
    String Tag5;
    String NumberofSteps;
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public createGame() {
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
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("createGame Initialization Failure", e);
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
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    public String nextButtonOfCreateGame_action() {
        GameAttributes game = new GameAttributes();
        game.setGameName(GameName);
        game.setBorders(Borders);
        game.setDescription(Description);
        game.setStartingPoint(StartingPoint);
        game.setNumberOfSteps(Integer.parseInt(NumberofSteps));
        if(!Tag1.isEmpty())
            game.addTag(Tag1);
        if(!Tag2.isEmpty())
            game.addTag(Tag2);
        if(!Tag3.isEmpty())
            game.addTag(Tag3);
        if(!Tag4.isEmpty())
            game.addTag(Tag4);
        if(!Tag5.isEmpty())
            game.addTag(Tag5);
        getSessionBean1().setNewGame(game);
        //TODO Check game name if it is in the database
        return "case1";
    }

    public String getBorders() {
        return Borders;
    }

    public void setBorders(String borders) {
        this.Borders = borders;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getGameName() {
        return GameName;
    }

    public void setGameName(String gameName) {
        this.GameName = gameName;
    }

    public String getNumberOfSteps() {
        return NumberofSteps;
    }

    public void setNumberOfSteps(String numberOfSteps) {
        this.NumberofSteps = numberOfSteps;
    }

    public String getStartingPoint() {
        return StartingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.StartingPoint = startingPoint;
    }

    public String getTag1() {
        return Tag1;
    }

    public void setTag1(String tag1) {
        this.Tag1 = tag1;
    }

    public String getTag2() {
        return Tag2;
    }

    public void setTag2(String tag2) {
        this.Tag2 = tag2;
    }

    public String getTag3() {
        return Tag3;
    }

    public void setTag3(String tag3) {
        this.Tag3 = tag3;
    }

    public String getTag4() {
        return Tag4;
    }

    public void setTag4(String tag4) {
        this.Tag4 = tag4;
    }

    public String getTag5() {
        return Tag5;
    }

    public void setTag5(String tag5) {
        this.Tag5 = tag5;
    }
}

