package K3;

import android.app.ActivityManager;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class a {
    public static final boolean a(AppCompatActivity appCompatActivity) {
        AbstractC3159y.i(appCompatActivity, "<this>");
        Object systemService = appCompatActivity.getSystemService("activity");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) systemService).getAppTasks();
        AbstractC3159y.h(appTasks, "getAppTasks(...)");
        List<ActivityManager.AppTask> list = appTasks;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((ActivityManager.AppTask) it.next()).getTaskInfo().persistentId == appCompatActivity.getTaskId()) {
                return true;
            }
        }
        return false;
    }
}
