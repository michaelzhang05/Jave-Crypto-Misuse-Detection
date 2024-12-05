package com.google.android.gms.common.images;

import android.widget.ImageView;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zac extends zaa {

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<ImageView> f10802b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zac)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ImageView imageView = this.f10802b.get();
        ImageView imageView2 = ((zac) obj).f10802b.get();
        return (imageView2 == null || imageView == null || !Objects.a(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }
}
