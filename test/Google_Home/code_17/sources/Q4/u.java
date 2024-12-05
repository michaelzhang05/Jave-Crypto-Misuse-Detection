package Q4;

import android.content.Context;
import android.os.Environment;
import android.os.storage.StorageManager;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class u {
    public final ArrayList a(String packagename) {
        File[] listFiles;
        boolean z8;
        AbstractC3255y.i(packagename, "packagename");
        ArrayList arrayList = new ArrayList();
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/Obb/" + packagename);
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            if (listFiles.length == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        String name = file2.getName();
                        AbstractC3255y.h(name, "fileObb.name");
                        if (j6.n.r(name, ".obb", false, 2, null)) {
                            arrayList.add(file2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b(Context context) {
        String str;
        AbstractC3255y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        Object systemService = context.getSystemService("storage");
        AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.os.storage.StorageManager");
        StorageManager storageManager = (StorageManager) systemService;
        try {
            Method method = StorageManager.class.getMethod("getVolumeList", (Class[]) Arrays.copyOf(new Class[0], 0));
            method.setAccessible(true);
            Object invoke = method.invoke(storageManager, Arrays.copyOf(new Object[0], 0));
            AbstractC3255y.g(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
            for (Object obj : (Object[]) invoke) {
                if (obj != null) {
                    try {
                        Object invoke2 = obj.getClass().getMethod("getPath", null).invoke(obj, null);
                        AbstractC3255y.g(invoke2, "null cannot be cast to non-null type kotlin.String");
                        str = (String) invoke2;
                    } catch (NoSuchMethodException unused) {
                        str = null;
                    }
                    if (str == null) {
                        Object invoke3 = obj.getClass().getMethod("getDirectory", null).invoke(obj, null);
                        AbstractC3255y.g(invoke3, "null cannot be cast to non-null type java.io.File");
                        str = ((File) invoke3).getAbsolutePath();
                    }
                    AbstractC3255y.f(str);
                    N4.e eVar = new N4.e(str);
                    File file = new File(str);
                    if (file.exists() && file.isDirectory()) {
                        eVar.e(file.getUsableSpace());
                        Method method2 = obj.getClass().getMethod("isRemovable", null);
                        try {
                            Object invoke4 = StorageManager.class.getMethod("getVolumeState", String.class).invoke(storageManager, eVar.b());
                            AbstractC3255y.g(invoke4, "null cannot be cast to non-null type kotlin.String");
                            eVar.g((String) invoke4);
                            Object invoke5 = method2.invoke(obj, null);
                            AbstractC3255y.g(invoke5, "null cannot be cast to non-null type kotlin.Boolean");
                            eVar.f(((Boolean) invoke5).booleanValue());
                        } catch (Exception unused2) {
                        }
                        arrayList.add(eVar);
                    }
                }
            }
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused3) {
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public final ArrayList c(Context context) {
        AbstractC3255y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList b8 = b(context);
            int size = b8.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (!j6.n.H(((N4.e) b8.get(i8)).b(), "/emulated/", false, 2, null) && ((N4.e) b8.get(i8)).d() && ((N4.e) b8.get(i8)).c()) {
                    File file = new File(((N4.e) b8.get(i8)).b() + ("/Android/data/" + context.getPackageName()));
                    if (!file.exists()) {
                        if (file.mkdirs()) {
                            arrayList.add(b8.get(i8));
                        }
                    } else if (file.canWrite()) {
                        arrayList.add(b8.get(i8));
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
