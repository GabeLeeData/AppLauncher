package gabriellee.project.applauncher.Activity;

import android.support.v4.app.Fragment;

import gabriellee.project.applauncher.Fragment.AppLauncherFragment;

public class AppLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return AppLauncherFragment.newInstance();
    }
}
