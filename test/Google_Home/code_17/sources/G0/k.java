package G0;

import L0.F;
import P5.AbstractC1378t;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f2916a = new k();

    private k() {
    }

    public static /* synthetic */ F.e.d.a.c c(k kVar, String str, int i8, int i9, boolean z8, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = 0;
        }
        if ((i10 & 8) != 0) {
            z8 = false;
        }
        return kVar.b(str, i8, i9, z8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        r0 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String f() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L10
            java.lang.String r0 = G0.j.a()
            java.lang.String r1 = "{\n      Process.myProcessName()\n    }"
            kotlin.jvm.internal.AbstractC3255y.h(r0, r1)
            goto L1d
        L10:
            r1 = 28
            java.lang.String r2 = ""
            if (r0 < r1) goto L1c
            java.lang.String r0 = V.l.a()
            if (r0 != 0) goto L1d
        L1c:
            r0 = r2
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.k.f():java.lang.String");
    }

    public final F.e.d.a.c a(String processName, int i8, int i9) {
        AbstractC3255y.i(processName, "processName");
        return c(this, processName, i8, i9, false, 8, null);
    }

    public final F.e.d.a.c b(String processName, int i8, int i9, boolean z8) {
        AbstractC3255y.i(processName, "processName");
        F.e.d.a.c a8 = F.e.d.a.c.a().e(processName).d(i8).c(i9).b(z8).a();
        AbstractC3255y.h(a8, "builder()\n      .setProc…ltProcess)\n      .build()");
        return a8;
    }

    public final List d(Context context) {
        ActivityManager activityManager;
        AbstractC3255y.i(context, "context");
        int i8 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = AbstractC1378t.m();
        }
        List j02 = AbstractC1378t.j0(list);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : j02) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i8) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1378t.x(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(F.e.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(AbstractC3255y.d(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    public final F.e.d.a.c e(Context context) {
        Object obj;
        AbstractC3255y.i(context, "context");
        int myPid = Process.myPid();
        Iterator it = d(context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((F.e.d.a.c) obj).c() == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        F.e.d.a.c cVar = (F.e.d.a.c) obj;
        if (cVar == null) {
            return c(this, f(), myPid, 0, false, 12, null);
        }
        return cVar;
    }
}
