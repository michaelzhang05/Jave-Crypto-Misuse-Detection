package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q extends l {

    /* renamed from: h, reason: collision with root package name */
    private static final j$.sun.misc.a f33371h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f33372i;

    /* renamed from: e, reason: collision with root package name */
    r f33373e;

    /* renamed from: f, reason: collision with root package name */
    volatile r f33374f;

    /* renamed from: g, reason: collision with root package name */
    volatile Thread f33375g;
    volatile int lockState;

    static {
        j$.sun.misc.a h8 = j$.sun.misc.a.h();
        f33371h = h8;
        f33372i = h8.j(q.class, "lockState");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(r rVar) {
        super(-2, null, null);
        int i8;
        this.f33374f = rVar;
        r rVar2 = null;
        while (rVar != null) {
            r rVar3 = (r) rVar.f33358d;
            rVar.f33378g = null;
            rVar.f33377f = null;
            if (rVar2 == null) {
                rVar.f33376e = null;
                rVar.f33380i = false;
            } else {
                Object obj = rVar.f33356b;
                int i9 = rVar.f33355a;
                r rVar4 = rVar2;
                Class<?> cls = null;
                while (true) {
                    Object obj2 = rVar4.f33356b;
                    int i10 = rVar4.f33355a;
                    if (i10 > i9) {
                        i8 = -1;
                    } else if (i10 < i9) {
                        i8 = 1;
                    } else {
                        if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                            int i11 = ConcurrentHashMap.f33321g;
                            int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                            if (compareTo != 0) {
                                i8 = compareTo;
                            }
                        }
                        i8 = i(obj, obj2);
                    }
                    r rVar5 = i8 <= 0 ? rVar4.f33377f : rVar4.f33378g;
                    if (rVar5 == null) {
                        break;
                    } else {
                        rVar4 = rVar5;
                    }
                }
                rVar.f33376e = rVar4;
                if (i8 <= 0) {
                    rVar4.f33377f = rVar;
                } else {
                    rVar4.f33378g = rVar;
                }
                rVar = c(rVar2, rVar);
            }
            rVar2 = rVar;
            rVar = rVar3;
        }
        this.f33373e = rVar2;
    }

    static r b(r rVar, r rVar2) {
        while (rVar2 != null && rVar2 != rVar) {
            r rVar3 = rVar2.f33376e;
            if (rVar3 == null) {
                rVar2.f33380i = false;
                return rVar2;
            }
            if (rVar2.f33380i) {
                rVar2.f33380i = false;
                return rVar;
            }
            r rVar4 = rVar3.f33377f;
            if (rVar4 == rVar2) {
                rVar4 = rVar3.f33378g;
                if (rVar4 != null && rVar4.f33380i) {
                    rVar4.f33380i = false;
                    rVar3.f33380i = true;
                    rVar = g(rVar, rVar3);
                    rVar3 = rVar2.f33376e;
                    rVar4 = rVar3 == null ? null : rVar3.f33378g;
                }
                if (rVar4 == null) {
                    rVar2 = rVar3;
                } else {
                    r rVar5 = rVar4.f33377f;
                    r rVar6 = rVar4.f33378g;
                    if ((rVar6 != null && rVar6.f33380i) || (rVar5 != null && rVar5.f33380i)) {
                        if (rVar6 == null || !rVar6.f33380i) {
                            if (rVar5 != null) {
                                rVar5.f33380i = false;
                            }
                            rVar4.f33380i = true;
                            rVar = h(rVar, rVar4);
                            rVar3 = rVar2.f33376e;
                            rVar4 = rVar3 != null ? rVar3.f33378g : null;
                        }
                        if (rVar4 != null) {
                            rVar4.f33380i = rVar3 == null ? false : rVar3.f33380i;
                            r rVar7 = rVar4.f33378g;
                            if (rVar7 != null) {
                                rVar7.f33380i = false;
                            }
                        }
                        if (rVar3 != null) {
                            rVar3.f33380i = false;
                            rVar = g(rVar, rVar3);
                        }
                        rVar2 = rVar;
                    }
                    rVar4.f33380i = true;
                    rVar2 = rVar3;
                }
            } else {
                if (rVar4 != null && rVar4.f33380i) {
                    rVar4.f33380i = false;
                    rVar3.f33380i = true;
                    rVar = h(rVar, rVar3);
                    rVar3 = rVar2.f33376e;
                    rVar4 = rVar3 == null ? null : rVar3.f33377f;
                }
                if (rVar4 == null) {
                    rVar2 = rVar3;
                } else {
                    r rVar8 = rVar4.f33377f;
                    r rVar9 = rVar4.f33378g;
                    if ((rVar8 != null && rVar8.f33380i) || (rVar9 != null && rVar9.f33380i)) {
                        if (rVar8 == null || !rVar8.f33380i) {
                            if (rVar9 != null) {
                                rVar9.f33380i = false;
                            }
                            rVar4.f33380i = true;
                            rVar = g(rVar, rVar4);
                            rVar3 = rVar2.f33376e;
                            rVar4 = rVar3 != null ? rVar3.f33377f : null;
                        }
                        if (rVar4 != null) {
                            rVar4.f33380i = rVar3 == null ? false : rVar3.f33380i;
                            r rVar10 = rVar4.f33377f;
                            if (rVar10 != null) {
                                rVar10.f33380i = false;
                            }
                        }
                        if (rVar3 != null) {
                            rVar3.f33380i = false;
                            rVar = h(rVar, rVar3);
                        }
                        rVar2 = rVar;
                    }
                    rVar4.f33380i = true;
                    rVar2 = rVar3;
                }
            }
        }
        return rVar;
    }

    static r c(r rVar, r rVar2) {
        r rVar3;
        rVar2.f33380i = true;
        while (true) {
            r rVar4 = rVar2.f33376e;
            if (rVar4 == null) {
                rVar2.f33380i = false;
                return rVar2;
            }
            if (!rVar4.f33380i || (rVar3 = rVar4.f33376e) == null) {
                break;
            }
            r rVar5 = rVar3.f33377f;
            if (rVar4 == rVar5) {
                rVar5 = rVar3.f33378g;
                if (rVar5 == null || !rVar5.f33380i) {
                    if (rVar2 == rVar4.f33378g) {
                        rVar = g(rVar, rVar4);
                        r rVar6 = rVar4.f33376e;
                        rVar3 = rVar6 == null ? null : rVar6.f33376e;
                        rVar4 = rVar6;
                        rVar2 = rVar4;
                    }
                    if (rVar4 != null) {
                        rVar4.f33380i = false;
                        if (rVar3 != null) {
                            rVar3.f33380i = true;
                            rVar = h(rVar, rVar3);
                        }
                    }
                } else {
                    rVar5.f33380i = false;
                    rVar4.f33380i = false;
                    rVar3.f33380i = true;
                    rVar2 = rVar3;
                }
            } else if (rVar5 == null || !rVar5.f33380i) {
                if (rVar2 == rVar4.f33377f) {
                    rVar = h(rVar, rVar4);
                    r rVar7 = rVar4.f33376e;
                    rVar3 = rVar7 == null ? null : rVar7.f33376e;
                    rVar4 = rVar7;
                    rVar2 = rVar4;
                }
                if (rVar4 != null) {
                    rVar4.f33380i = false;
                    if (rVar3 != null) {
                        rVar3.f33380i = true;
                        rVar = g(rVar, rVar3);
                    }
                }
            } else {
                rVar5.f33380i = false;
                rVar4.f33380i = false;
                rVar3.f33380i = true;
                rVar2 = rVar3;
            }
        }
        return rVar;
    }

    private final void d() {
        if (f33371h.c(this, f33372i, 0, 1)) {
            return;
        }
        boolean z8 = false;
        while (true) {
            int i8 = this.lockState;
            if ((i8 & (-3)) == 0) {
                if (f33371h.c(this, f33372i, i8, 1)) {
                    break;
                }
            } else if ((i8 & 2) == 0) {
                if (f33371h.c(this, f33372i, i8, i8 | 2)) {
                    this.f33375g = Thread.currentThread();
                    z8 = true;
                }
            } else if (z8) {
                LockSupport.park(this);
            }
        }
        if (z8) {
            this.f33375g = null;
        }
    }

    static r g(r rVar, r rVar2) {
        r rVar3;
        if (rVar2 != null && (rVar3 = rVar2.f33378g) != null) {
            r rVar4 = rVar3.f33377f;
            rVar2.f33378g = rVar4;
            if (rVar4 != null) {
                rVar4.f33376e = rVar2;
            }
            r rVar5 = rVar2.f33376e;
            rVar3.f33376e = rVar5;
            if (rVar5 == null) {
                rVar3.f33380i = false;
                rVar = rVar3;
            } else if (rVar5.f33377f == rVar2) {
                rVar5.f33377f = rVar3;
            } else {
                rVar5.f33378g = rVar3;
            }
            rVar3.f33377f = rVar2;
            rVar2.f33376e = rVar3;
        }
        return rVar;
    }

    static r h(r rVar, r rVar2) {
        r rVar3;
        if (rVar2 != null && (rVar3 = rVar2.f33377f) != null) {
            r rVar4 = rVar3.f33378g;
            rVar2.f33377f = rVar4;
            if (rVar4 != null) {
                rVar4.f33376e = rVar2;
            }
            r rVar5 = rVar2.f33376e;
            rVar3.f33376e = rVar5;
            if (rVar5 == null) {
                rVar3.f33380i = false;
                rVar = rVar3;
            } else if (rVar5.f33378g == rVar2) {
                rVar5.f33378g = rVar3;
            } else {
                rVar5.f33377f = rVar3;
            }
            rVar3.f33378g = rVar2;
            rVar2.f33376e = rVar3;
        }
        return rVar;
    }

    static int i(Object obj, Object obj2) {
        int compareTo;
        return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(int i8, Object obj) {
        Object obj2;
        Thread thread;
        Thread thread2;
        r rVar = null;
        if (obj != null) {
            l lVar = this.f33374f;
            while (lVar != null) {
                int i9 = this.lockState;
                if ((i9 & 3) == 0) {
                    j$.sun.misc.a aVar = f33371h;
                    long j8 = f33372i;
                    if (aVar.c(this, j8, i9, i9 + 4)) {
                        try {
                            r rVar2 = this.f33373e;
                            if (rVar2 != null) {
                                rVar = rVar2.b(i8, obj, null);
                            }
                            if (aVar.f(this, j8) == 6 && (thread2 = this.f33375g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return rVar;
                        } catch (Throwable th) {
                            if (f33371h.f(this, f33372i) == 6 && (thread = this.f33375g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th;
                        }
                    }
                } else {
                    if (lVar.f33355a == i8 && ((obj2 = lVar.f33356b) == obj || (obj2 != null && obj.equals(obj2)))) {
                        return lVar;
                    }
                    lVar = lVar.f33358d;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b3, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0070, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.concurrent.r e(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.e(int, java.lang.Object, java.lang.Object):j$.util.concurrent.r");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(j$.util.concurrent.r r11) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.f(j$.util.concurrent.r):boolean");
    }
}
