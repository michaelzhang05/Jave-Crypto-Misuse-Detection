package t0;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.wallet.button.ButtonOptions;

/* loaded from: classes3.dex */
public final class e {
    public static final View a(Context context, ButtonOptions buttonOptions) {
        d dVar;
        DynamiteModule b8 = b(context);
        try {
            IBinder d8 = b8.d("com.google.android.gms.wallet.dynamite.PayButtonCreatorChimeraImpl");
            if (d8 == null) {
                dVar = null;
            } else {
                IInterface queryLocalInterface = d8.queryLocalInterface("com.google.android.gms.wallet.button.IPayButtonCreator");
                if (queryLocalInterface instanceof d) {
                    dVar = (d) queryLocalInterface;
                } else {
                    dVar = new d(d8);
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
        if (dVar != null) {
            return (View) Z.b.l(dVar.m0(Z.b.m0(new Context[]{b8.b(), context}), buttonOptions));
        }
        Log.e("PayButtonProxy", "Failed to get the actual PayButtonCreatorChimeraImpl.");
        return null;
    }

    private static final DynamiteModule b(Context context) {
        try {
            return DynamiteModule.e(context, DynamiteModule.f15209b, "com.google.android.gms.wallet_dynamite");
        } catch (DynamiteModule.a e8) {
            throw new IllegalStateException(e8);
        }
    }
}
