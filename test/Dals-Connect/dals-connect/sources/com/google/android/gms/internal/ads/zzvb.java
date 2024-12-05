package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzvb {

    /* renamed from: b, reason: collision with root package name */
    private final int f15665b;

    /* renamed from: d, reason: collision with root package name */
    private final zzva f15667d = new zzvf();
    private final int a = 6;

    /* renamed from: c, reason: collision with root package name */
    private final int f15666c = 0;

    public zzvb(int i2) {
        this.f15665b = i2;
    }

    @VisibleForTesting
    private final String b(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        u40 u40Var = new u40();
        PriorityQueue priorityQueue = new PriorityQueue(this.f15665b, new t40(this));
        for (String str2 : split) {
            String[] b2 = zzve.b(str2, false);
            if (b2.length != 0) {
                zzvh.d(b2, this.f15665b, this.a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                u40Var.a(this.f15667d.a(((zzvi) it.next()).f15669b));
            } catch (IOException e2) {
                zzbad.c("Error while writing hash to byteStream", e2);
            }
        }
        return u40Var.toString();
    }

    public final String a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayList.get(i2);
            i2++;
            sb.append(str.toLowerCase(Locale.US));
            sb.append('\n');
        }
        return b(sb.toString());
    }
}
