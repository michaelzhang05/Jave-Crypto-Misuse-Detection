package com.facebook;

import com.facebook.internal.k;
import java.util.Random;

/* loaded from: classes.dex */
public class FacebookException extends RuntimeException {

    /* loaded from: classes.dex */
    class a implements k.c {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // com.facebook.internal.k.c
        public void a(boolean z) {
            if (z) {
                try {
                    com.facebook.internal.a0.g.b.c(this.a);
                } catch (Exception unused) {
                }
            }
        }
    }

    public FacebookException() {
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str == null || !f.w() || random.nextInt(100) <= 50) {
            return;
        }
        com.facebook.internal.k.a(k.d.ErrorReport, new a(str));
    }

    public FacebookException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookException(Throwable th) {
        super(th);
    }
}
