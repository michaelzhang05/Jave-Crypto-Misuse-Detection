package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
/* loaded from: classes2.dex */
public final class Objects {

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class ToStringHelper {
        private final List<String> a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f10870b;

        private ToStringHelper(Object obj) {
            this.f10870b = Preconditions.j(obj);
            this.a = new ArrayList();
        }

        @KeepForSdk
        public final ToStringHelper a(String str, Object obj) {
            List<String> list = this.a;
            String str2 = (String) Preconditions.j(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + valueOf.length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        @KeepForSdk
        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f10870b.getClass().getSimpleName());
            sb.append('{');
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(this.a.get(i2));
                if (i2 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @KeepForSdk
    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @KeepForSdk
    public static ToStringHelper c(Object obj) {
        return new ToStringHelper(obj);
    }
}
