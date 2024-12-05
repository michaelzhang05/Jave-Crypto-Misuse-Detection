package s0;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.wallet.button.ButtonOptions;

/* renamed from: s0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3989e {
    public static final View a(Context context, ButtonOptions buttonOptions) {
        C3988d c3988d;
        DynamiteModule b8 = b(context);
        try {
            IBinder d8 = b8.d("com.google.android.gms.wallet.dynamite.PayButtonCreatorChimeraImpl");
            if (d8 == null) {
                c3988d = null;
            } else {
                IInterface queryLocalInterface = d8.queryLocalInterface("com.google.android.gms.wallet.button.IPayButtonCreator");
                if (queryLocalInterface instanceof C3988d) {
                    c3988d = (C3988d) queryLocalInterface;
                } else {
                    c3988d = new C3988d(d8);
                }
            }
        } catch (RemoteException e8) {
            e = e8;
            Log.e("PayButtonProxy", "Failed to create PayButton using dynamite package", e);
            return null;
        } catch (DynamiteModule.a e9) {
            e = e9;
            Log.e("PayButtonProxy", "Failed to create PayButton using dynamite package", e);
            return null;
        }
        if (c3988d != null) {
            return (View) Y.b.k(c3988d.s0(Y.b.s0(new Context[]{b8.b(), context}), buttonOptions));
        }
        Log.e("PayButtonProxy", "Failed to get the actual PayButtonCreatorChimeraImpl.");
        return null;
    }

    private static final DynamiteModule b(Context context) {
        try {
            return DynamiteModule.e(context, DynamiteModule.f16010b, "com.google.android.gms.wallet_dynamite");
        } catch (DynamiteModule.a e8) {
            throw new IllegalStateException(e8);
        }
    }
}
