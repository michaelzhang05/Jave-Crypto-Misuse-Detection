package l0;

import N.AbstractC1343n;
import Q.AbstractC1400p;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* renamed from: l0.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3278m {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f34203a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34204b;

    public C3278m(Context context, String str) {
        AbstractC1400p.l(context);
        this.f34203a = context.getResources();
        if (!TextUtils.isEmpty(str)) {
            this.f34204b = str;
        } else {
            this.f34204b = a(context);
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(AbstractC1343n.f7480a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.f34203a.getIdentifier(str, TypedValues.Custom.S_STRING, this.f34204b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f34203a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
