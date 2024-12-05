package Q;

import N.AbstractC1343n;
import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* renamed from: Q.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1402s {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f9079a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9080b;

    public C1402s(Context context) {
        AbstractC1400p.l(context);
        Resources resources = context.getResources();
        this.f9079a = resources;
        this.f9080b = resources.getResourcePackageName(AbstractC1343n.f7480a);
    }

    public String a(String str) {
        int identifier = this.f9079a.getIdentifier(str, TypedValues.Custom.S_STRING, this.f9080b);
        if (identifier == 0) {
            return null;
        }
        return this.f9079a.getString(identifier);
    }
}
