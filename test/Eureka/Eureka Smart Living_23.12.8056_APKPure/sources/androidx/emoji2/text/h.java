package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.e;
import androidx.emoji2.text.m;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final e.i f2536a;

    /* renamed from: b, reason: collision with root package name */
    private final m f2537b;

    /* renamed from: c, reason: collision with root package name */
    private e.d f2538c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f2539d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f2540e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        static int a(CharSequence charSequence, int i6, int i7) {
            int length = charSequence.length();
            if (i6 < 0 || length < i6 || i7 < 0) {
                return -1;
            }
            while (true) {
                boolean z5 = false;
                while (i7 != 0) {
                    i6--;
                    if (i6 < 0) {
                        return z5 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i6);
                    if (z5) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i7--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i7--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z5 = true;
                    }
                }
                return i6;
            }
        }

        static int b(CharSequence charSequence, int i6, int i7) {
            int length = charSequence.length();
            if (i6 < 0 || length < i6 || i7 < 0) {
                return -1;
            }
            while (true) {
                boolean z5 = false;
                while (i7 != 0) {
                    if (i6 >= length) {
                        if (z5) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i6);
                    if (z5) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i7--;
                        i6++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i7--;
                        i6++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i6++;
                        z5 = true;
                    }
                }
                return i6;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f2541a = 1;

        /* renamed from: b, reason: collision with root package name */
        private final m.a f2542b;

        /* renamed from: c, reason: collision with root package name */
        private m.a f2543c;

        /* renamed from: d, reason: collision with root package name */
        private m.a f2544d;

        /* renamed from: e, reason: collision with root package name */
        private int f2545e;

        /* renamed from: f, reason: collision with root package name */
        private int f2546f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f2547g;

        /* renamed from: h, reason: collision with root package name */
        private final int[] f2548h;

        b(m.a aVar, boolean z5, int[] iArr) {
            this.f2542b = aVar;
            this.f2543c = aVar;
            this.f2547g = z5;
            this.f2548h = iArr;
        }

        private static boolean d(int i6) {
            return i6 == 65039;
        }

        private static boolean f(int i6) {
            return i6 == 65038;
        }

        private int g() {
            this.f2541a = 1;
            this.f2543c = this.f2542b;
            this.f2546f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f2543c.b().j() || d(this.f2545e)) {
                return true;
            }
            if (this.f2547g) {
                if (this.f2548h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f2548h, this.f2543c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i6) {
            m.a a6 = this.f2543c.a(i6);
            int i7 = 2;
            if (this.f2541a != 2) {
                if (a6 != null) {
                    this.f2541a = 2;
                    this.f2543c = a6;
                    this.f2546f = 1;
                }
                i7 = g();
            } else if (a6 != null) {
                this.f2543c = a6;
                this.f2546f++;
            } else {
                if (!f(i6)) {
                    if (!d(i6)) {
                        if (this.f2543c.b() != null) {
                            i7 = 3;
                            if (this.f2546f != 1 || h()) {
                                this.f2544d = this.f2543c;
                                g();
                            }
                        }
                    }
                }
                i7 = g();
            }
            this.f2545e = i6;
            return i7;
        }

        g b() {
            return this.f2543c.b();
        }

        g c() {
            return this.f2544d.b();
        }

        boolean e() {
            return this.f2541a == 2 && this.f2543c.b() != null && (this.f2546f > 1 || h());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(m mVar, e.i iVar, e.d dVar, boolean z5, int[] iArr) {
        this.f2536a = iVar;
        this.f2537b = mVar;
        this.f2538c = dVar;
        this.f2539d = z5;
        this.f2540e = iArr;
    }

    private void a(Spannable spannable, g gVar, int i6, int i7) {
        spannable.setSpan(this.f2536a.a(gVar), i6, i7, 33);
    }

    private static boolean b(Editable editable, KeyEvent keyEvent, boolean z5) {
        i[] iVarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (iVarArr = (i[]) editable.getSpans(selectionStart, selectionEnd, i.class)) != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                int spanStart = editable.getSpanStart(iVar);
                int spanEnd = editable.getSpanEnd(iVar);
                if ((z5 && spanStart == selectionStart) || ((!z5 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(InputConnection inputConnection, Editable editable, int i6, int i7, boolean z5) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i6 >= 0 && i7 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z5) {
                max = a.a(editable, selectionStart, Math.max(i6, 0));
                min = a.b(editable, selectionEnd, Math.max(i7, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i6, 0);
                min = Math.min(selectionEnd + i7, editable.length());
            }
            i[] iVarArr = (i[]) editable.getSpans(max, min, i.class);
            if (iVarArr != null && iVarArr.length > 0) {
                for (i iVar : iVarArr) {
                    int spanStart = editable.getSpanStart(iVar);
                    int spanEnd = editable.getSpanEnd(iVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(Editable editable, int i6, KeyEvent keyEvent) {
        if (!(i6 != 67 ? i6 != 112 ? false : b(editable, keyEvent, true) : b(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean e(CharSequence charSequence, int i6, int i7, g gVar) {
        if (gVar.d() == 0) {
            gVar.k(this.f2538c.a(charSequence, i6, i7, gVar.h()));
        }
        return gVar.d() == 2;
    }

    private static boolean f(int i6, int i7) {
        return i6 == -1 || i7 == -1 || i6 != i7;
    }

    private static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0122, code lost:
    
        ((androidx.emoji2.text.n) r11).d();
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:99:0x000e, B:102:0x0013, B:104:0x0017, B:106:0x0024, B:9:0x0037, B:11:0x003f, B:13:0x0042, B:15:0x0046, B:17:0x0052, B:19:0x0055, B:23:0x0062, B:29:0x0071, B:30:0x007d, B:34:0x0098, B:60:0x00a8, B:64:0x00b4, B:65:0x00be, B:47:0x00c8, B:50:0x00cf, B:37:0x00d4, B:39:0x00df, B:71:0x00e6, B:75:0x00f0, B:78:0x00fc, B:79:0x0102, B:81:0x010b, B:6:0x002c), top: B:98:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:99:0x000e, B:102:0x0013, B:104:0x0017, B:106:0x0024, B:9:0x0037, B:11:0x003f, B:13:0x0042, B:15:0x0046, B:17:0x0052, B:19:0x0055, B:23:0x0062, B:29:0x0071, B:30:0x007d, B:34:0x0098, B:60:0x00a8, B:64:0x00b4, B:65:0x00be, B:47:0x00c8, B:50:0x00cf, B:37:0x00d4, B:39:0x00df, B:71:0x00e6, B:75:0x00f0, B:78:0x00fc, B:79:0x0102, B:81:0x010b, B:6:0x002c), top: B:98:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010b A[Catch: all -> 0x0129, TRY_LEAVE, TryCatch #0 {all -> 0x0129, blocks: (B:99:0x000e, B:102:0x0013, B:104:0x0017, B:106:0x0024, B:9:0x0037, B:11:0x003f, B:13:0x0042, B:15:0x0046, B:17:0x0052, B:19:0x0055, B:23:0x0062, B:29:0x0071, B:30:0x007d, B:34:0x0098, B:60:0x00a8, B:64:0x00b4, B:65:0x00be, B:47:0x00c8, B:50:0x00cf, B:37:0x00d4, B:39:0x00df, B:71:0x00e6, B:75:0x00f0, B:78:0x00fc, B:79:0x0102, B:81:0x010b, B:6:0x002c), top: B:98:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence h(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.h.h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
