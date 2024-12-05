package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: classes2.dex */
final class fx implements ListIterator<String> {

    /* renamed from: f, reason: collision with root package name */
    private ListIterator<String> f11439f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f11440g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzdqw f11441h;

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.android.gms.internal.ads.zzdqw.a(com.google.android.gms.internal.ads.zzdqw):com.google.android.gms.internal.ads.zzdot
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:74)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:49)
        Caused by: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
        	at java.base/java.util.ArrayList.add(ArrayList.java:485)
        	at java.base/java.util.ArrayList.add(ArrayList.java:497)
        	at jadx.core.utils.ListUtils.safeReplace(ListUtils.java:98)
        	at jadx.core.dex.visitors.InlineMethods.replaceClsUsage(InlineMethods.java:167)
        	at jadx.core.dex.visitors.InlineMethods.lambda$updateUsageInfo$0(InlineMethods.java:159)
        	at jadx.core.dex.nodes.InsnNode.visitInsns(InsnNode.java:284)
        	at jadx.core.dex.visitors.InlineMethods.updateUsageInfo(InlineMethods.java:138)
        	at jadx.core.dex.visitors.InlineMethods.inlineMethod(InlineMethods.java:120)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:72)
        	... 1 more
        */
    fx(com.google.android.gms.internal.ads.zzdqw r1, int r2) {
        /*
            r0 = this;
            r0.f11441h = r1
            r0.f11440g = r2
            r0.<init>()
            com.google.android.gms.internal.ads.zzdot r1 = com.google.android.gms.internal.ads.zzdqw.a(r1)
            java.util.ListIterator r1 = r1.listIterator(r2)
            r0.f11439f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fx.<init>(com.google.android.gms.internal.ads.zzdqw, int):void");
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f11439f.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f11439f.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f11439f.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11439f.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f11439f.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11439f.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
