package com.getcapacitor;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class f1 {

    /* renamed from: e, reason: collision with root package name */
    static final Pattern f4366e = Pattern.compile("/");

    /* renamed from: a, reason: collision with root package name */
    private Object f4367a;

    /* renamed from: b, reason: collision with root package name */
    private int f4368b;

    /* renamed from: c, reason: collision with root package name */
    private String f4369c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f4370d;

    private f1() {
        this.f4367a = null;
        this.f4368b = -1;
        this.f4370d = new ArrayList();
        this.f4369c = null;
    }

    public void a(String str, String str2, String str3, Object obj) {
        String[] strArr;
        int i6;
        String str4 = str3;
        if (obj == null) {
            throw new IllegalArgumentException("Code can't be null");
        }
        if (str4 != null) {
            if (!str3.isEmpty() && str4.charAt(0) == '/') {
                str4 = str4.substring(1);
            }
            strArr = f4366e.split(str4);
        } else {
            strArr = null;
        }
        int length = strArr != null ? strArr.length : 0;
        f1 f1Var = this;
        int i7 = -2;
        while (i7 < length) {
            String str5 = i7 == -2 ? str : i7 == -1 ? str2 : strArr[i7];
            ArrayList arrayList = f1Var.f4370d;
            int size = arrayList.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    break;
                }
                f1 f1Var2 = (f1) arrayList.get(i8);
                if (str5.equals(f1Var2.f4369c)) {
                    f1Var = f1Var2;
                    break;
                }
                i8++;
            }
            if (i8 == size) {
                f1 f1Var3 = new f1();
                if (i7 == -1 && str5.contains("*")) {
                    i6 = 3;
                } else if (str5.equals("**")) {
                    i6 = 2;
                } else {
                    if (str5.equals("*")) {
                        f1Var3.f4368b = 1;
                    } else {
                        f1Var3.f4368b = 0;
                    }
                    f1Var3.f4369c = str5;
                    f1Var.f4370d.add(f1Var3);
                    f1Var = f1Var3;
                }
                f1Var3.f4368b = i6;
                f1Var3.f4369c = str5;
                f1Var.f4370d.add(f1Var3);
                f1Var = f1Var3;
            }
            i7++;
        }
        f1Var.f4367a = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (a1.a.c.a(r10.f4369c).a(r5) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0065, code lost:
    
        if (r10.f4369c.equals(r5) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b A[LOOP:1: B:15:0x0039->B:27:0x006b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[EDGE_INSN: B:28:0x006e->B:29:0x006e BREAK  A[LOOP:1: B:15:0x0039->B:27:0x006b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(android.net.Uri r14) {
        /*
            r13 = this;
            java.util.List r0 = r14.getPathSegments()
            int r1 = r0.size()
            if (r1 != 0) goto L13
            java.lang.String r2 = r14.getAuthority()
            if (r2 != 0) goto L13
            java.lang.Object r14 = r13.f4367a
            return r14
        L13:
            r2 = -2
            r4 = r13
            r3 = -2
        L16:
            if (r3 >= r1) goto L75
            if (r3 != r2) goto L1f
            java.lang.String r5 = r14.getScheme()
            goto L2d
        L1f:
            r5 = -1
            if (r3 != r5) goto L27
            java.lang.String r5 = r14.getAuthority()
            goto L2d
        L27:
            java.lang.Object r5 = r0.get(r3)
            java.lang.String r5 = (java.lang.String) r5
        L2d:
            java.util.ArrayList r6 = r4.f4370d
            if (r6 != 0) goto L32
            goto L75
        L32:
            int r4 = r6.size()
            r7 = 0
            r8 = 0
            r9 = r7
        L39:
            if (r8 >= r4) goto L6e
            java.lang.Object r10 = r6.get(r8)
            com.getcapacitor.f1 r10 = (com.getcapacitor.f1) r10
            int r11 = r10.f4368b
            if (r11 == 0) goto L5f
            r12 = 1
            if (r11 == r12) goto L67
            r12 = 2
            if (r11 == r12) goto L5c
            r12 = 3
            if (r11 == r12) goto L4f
            goto L68
        L4f:
            java.lang.String r11 = r10.f4369c
            a1.a r11 = a1.a.c.a(r11)
            boolean r11 = r11.a(r5)
            if (r11 == 0) goto L68
            goto L67
        L5c:
            java.lang.Object r14 = r10.f4367a
            return r14
        L5f:
            java.lang.String r11 = r10.f4369c
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L68
        L67:
            r9 = r10
        L68:
            if (r9 == 0) goto L6b
            goto L6e
        L6b:
            int r8 = r8 + 1
            goto L39
        L6e:
            r4 = r9
            if (r4 != 0) goto L72
            return r7
        L72:
            int r3 = r3 + 1
            goto L16
        L75:
            java.lang.Object r14 = r4.f4367a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getcapacitor.f1.b(android.net.Uri):java.lang.Object");
    }

    public f1(Object obj) {
        this.f4367a = obj;
        this.f4368b = -1;
        this.f4370d = new ArrayList();
        this.f4369c = null;
    }
}
