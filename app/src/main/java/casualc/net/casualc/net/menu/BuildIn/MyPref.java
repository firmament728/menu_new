package casualc.net.menu.BuildIn;

import org.androidannotations.annotations.sharedpreferences.SharedPref;

@SharedPref(SharedPref.Scope.APPLICATION_DEFAULT) @SuppressWarnings("unused")
public interface MyPref
{
    // private
    String url();
    String id();


    // public

}
