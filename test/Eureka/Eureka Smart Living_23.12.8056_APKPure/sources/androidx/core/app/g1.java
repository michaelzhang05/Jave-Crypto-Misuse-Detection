package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class g1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(g1 g1Var) {
            throw null;
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static RemoteInput a(g1 g1Var) {
        return a.b(g1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RemoteInput[] b(g1[] g1VarArr) {
        if (g1VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[g1VarArr.length];
        for (int i6 = 0; i6 < g1VarArr.length; i6++) {
            g1 g1Var = g1VarArr[i6];
            remoteInputArr[i6] = a(null);
        }
        return remoteInputArr;
    }
}
