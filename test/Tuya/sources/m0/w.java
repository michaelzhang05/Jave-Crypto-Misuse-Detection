package m0;

import R.AbstractC1319p;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public abstract class w {
    public static String a(String str, String[] strArr, String[] strArr2) {
        AbstractC1319p.l(strArr);
        AbstractC1319p.l(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i8 = 0; i8 < min; i8++) {
            String str2 = strArr[i8];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i8];
            }
        }
        return null;
    }

    public static String b(Context context, String str, String str2) {
        AbstractC1319p.l(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = k.a(context);
        }
        return k.b("google_app_id", resources, str2);
    }
}
