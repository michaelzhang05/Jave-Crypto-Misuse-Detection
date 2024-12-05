package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okhttp3.HttpUrl;

@VisibleForTesting
/* loaded from: classes2.dex */
final class u40 {

    @VisibleForTesting
    private ByteArrayOutputStream a = new ByteArrayOutputStream(RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    private Base64OutputStream f12214b = new Base64OutputStream(this.a, 10);

    public final void a(byte[] bArr) throws IOException {
        this.f12214b.write(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        try {
            this.f12214b.close();
        } catch (IOException e2) {
            zzbad.c("HashManager: Unable to convert to Base64.", e2);
        }
        try {
            this.a.close();
            return this.a.toString();
        } catch (IOException e3) {
            zzbad.c("HashManager: Unable to convert to Base64.", e3);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } finally {
            this.a = null;
            this.f12214b = null;
        }
    }
}
