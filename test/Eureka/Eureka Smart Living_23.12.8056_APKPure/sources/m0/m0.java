package m0;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static Field f7505a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f7506b;

    public abstract void a(View view);

    public abstract float b(View view);

    public abstract void c(View view);

    public abstract void d(View view, int i6, int i7, int i8, int i9);

    public abstract void e(View view, float f6);

    public void f(View view, int i6) {
        if (!f7506b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f7505a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f7506b = true;
        }
        Field field = f7505a;
        if (field != null) {
            try {
                f7505a.setInt(view, i6 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);
}
