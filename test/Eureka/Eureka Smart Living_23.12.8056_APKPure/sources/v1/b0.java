package v1;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class b0 implements DialogInterface.OnClickListener {
    public static b0 b(Activity activity, Intent intent, int i6) {
        return new z(intent, activity, i6);
    }

    public static b0 c(u1.e eVar, Intent intent, int i6) {
        return new a0(intent, eVar, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        try {
            a();
        } catch (ActivityNotFoundException e6) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e6);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
