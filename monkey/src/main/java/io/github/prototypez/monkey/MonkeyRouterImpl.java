package io.github.prototypez.monkey;

import android.util.Log;

import io.github.prototypez.appjoint.core.RouterProvider;
import io.github.prototypez.router.FuncMonkeyRouter;

/**
 * Created by zhounl on 2017/11/27.
 */
@RouterProvider
public class MonkeyRouterImpl implements FuncMonkeyRouter {
    @Override
    public void startMonkey() {
        Log.i("AppJoint", "start monkey!");
    }

    @Override
    public void startMonkeyForResult() {
        Log.i("AppJoint", "start monkey for result!");
    }
}