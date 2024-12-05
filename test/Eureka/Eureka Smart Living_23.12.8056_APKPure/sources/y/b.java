package y;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
abstract class b {

    /* loaded from: classes.dex */
    public interface a {
        void a(Object obj, Rect rect);
    }

    /* renamed from: y.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0150b {
        int a(Object obj);

        Object b(Object obj, int i6);
    }

    /* loaded from: classes.dex */
    private static class c implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f9858a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        private final Rect f9859b = new Rect();

        /* renamed from: c, reason: collision with root package name */
        private final boolean f9860c;

        /* renamed from: d, reason: collision with root package name */
        private final a f9861d;

        c(boolean z5, a aVar) {
            this.f9860c = z5;
            this.f9861d = aVar;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Rect rect = this.f9858a;
            Rect rect2 = this.f9859b;
            this.f9861d.a(obj, rect);
            this.f9861d.a(obj2, rect2);
            int i6 = rect.top;
            int i7 = rect2.top;
            if (i6 < i7) {
                return -1;
            }
            if (i6 > i7) {
                return 1;
            }
            int i8 = rect.left;
            int i9 = rect2.left;
            if (i8 < i9) {
                return this.f9860c ? 1 : -1;
            }
            if (i8 > i9) {
                return this.f9860c ? -1 : 1;
            }
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.right;
            int i13 = rect2.right;
            if (i12 < i13) {
                return this.f9860c ? 1 : -1;
            }
            if (i12 > i13) {
                return this.f9860c ? -1 : 1;
            }
            return 0;
        }
    }

    private static boolean a(int i6, Rect rect, Rect rect2, Rect rect3) {
        boolean b6 = b(i6, rect, rect2);
        if (b(i6, rect, rect3) || !b6) {
            return false;
        }
        return !j(i6, rect, rect3) || i6 == 17 || i6 == 66 || k(i6, rect, rect2) < m(i6, rect, rect3);
    }

    private static boolean b(int i6, Rect rect, Rect rect2) {
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(java.lang.Object r7, y.b.InterfaceC0150b r8, y.b.a r9, java.lang.Object r10, android.graphics.Rect r11, int r12) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r11)
            r1 = 17
            r2 = 0
            if (r12 == r1) goto L38
            r1 = 33
            if (r12 == r1) goto L2e
            r1 = 66
            if (r12 == r1) goto L26
            r1 = 130(0x82, float:1.82E-43)
            if (r12 != r1) goto L1e
            int r1 = r11.height()
            int r1 = r1 + 1
            int r1 = -r1
            goto L34
        L1e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7.<init>(r8)
            throw r7
        L26:
            int r1 = r11.width()
            int r1 = r1 + 1
            int r1 = -r1
            goto L3e
        L2e:
            int r1 = r11.height()
            int r1 = r1 + 1
        L34:
            r0.offset(r2, r1)
            goto L41
        L38:
            int r1 = r11.width()
            int r1 = r1 + 1
        L3e:
            r0.offset(r1, r2)
        L41:
            int r1 = r8.a(r7)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r4 = 0
        L4b:
            if (r2 >= r1) goto L64
            java.lang.Object r5 = r8.b(r7, r2)
            if (r5 != r10) goto L54
            goto L61
        L54:
            r9.a(r5, r3)
            boolean r6 = h(r12, r11, r3, r0)
            if (r6 == 0) goto L61
            r0.set(r3)
            r4 = r5
        L61:
            int r2 = r2 + 1
            goto L4b
        L64:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y.b.c(java.lang.Object, y.b$b, y.b$a, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    public static Object d(Object obj, InterfaceC0150b interfaceC0150b, a aVar, Object obj2, int i6, boolean z5, boolean z6) {
        int a6 = interfaceC0150b.a(obj);
        ArrayList arrayList = new ArrayList(a6);
        for (int i7 = 0; i7 < a6; i7++) {
            arrayList.add(interfaceC0150b.b(obj, i7));
        }
        Collections.sort(arrayList, new c(z5, aVar));
        if (i6 == 1) {
            return f(obj2, arrayList, z6);
        }
        if (i6 == 2) {
            return e(obj2, arrayList, z6);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static Object e(Object obj, ArrayList arrayList, boolean z5) {
        int size = arrayList.size();
        int lastIndexOf = (obj == null ? -1 : arrayList.lastIndexOf(obj)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z5 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static Object f(Object obj, ArrayList arrayList, boolean z5) {
        int size = arrayList.size();
        int indexOf = (obj == null ? size : arrayList.indexOf(obj)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z5 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int g(int i6, int i7) {
        return (i6 * 13 * i6) + (i7 * i7);
    }

    private static boolean h(int i6, Rect rect, Rect rect2, Rect rect3) {
        if (!i(rect, rect2, i6)) {
            return false;
        }
        if (i(rect, rect3, i6) && !a(i6, rect, rect2, rect3)) {
            return !a(i6, rect, rect3, rect2) && g(k(i6, rect, rect2), o(i6, rect, rect2)) < g(k(i6, rect, rect3), o(i6, rect, rect3));
        }
        return true;
    }

    private static boolean i(Rect rect, Rect rect2, int i6) {
        if (i6 == 17) {
            int i7 = rect.right;
            int i8 = rect2.right;
            return (i7 > i8 || rect.left >= i8) && rect.left > rect2.left;
        }
        if (i6 == 33) {
            int i9 = rect.bottom;
            int i10 = rect2.bottom;
            return (i9 > i10 || rect.top >= i10) && rect.top > rect2.top;
        }
        if (i6 == 66) {
            int i11 = rect.left;
            int i12 = rect2.left;
            return (i11 < i12 || rect.right <= i12) && rect.right < rect2.right;
        }
        if (i6 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i13 = rect.top;
        int i14 = rect2.top;
        return (i13 < i14 || rect.bottom <= i14) && rect.bottom < rect2.bottom;
    }

    private static boolean j(int i6, Rect rect, Rect rect2) {
        if (i6 == 17) {
            return rect.left >= rect2.right;
        }
        if (i6 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i6 == 66) {
            return rect.right <= rect2.left;
        }
        if (i6 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int k(int i6, Rect rect, Rect rect2) {
        return Math.max(0, l(i6, rect, rect2));
    }

    private static int l(int i6, Rect rect, Rect rect2) {
        int i7;
        int i8;
        if (i6 == 17) {
            i7 = rect.left;
            i8 = rect2.right;
        } else if (i6 == 33) {
            i7 = rect.top;
            i8 = rect2.bottom;
        } else if (i6 == 66) {
            i7 = rect2.left;
            i8 = rect.right;
        } else {
            if (i6 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i7 = rect2.top;
            i8 = rect.bottom;
        }
        return i7 - i8;
    }

    private static int m(int i6, Rect rect, Rect rect2) {
        return Math.max(1, n(i6, rect, rect2));
    }

    private static int n(int i6, Rect rect, Rect rect2) {
        int i7;
        int i8;
        if (i6 == 17) {
            i7 = rect.left;
            i8 = rect2.left;
        } else if (i6 == 33) {
            i7 = rect.top;
            i8 = rect2.top;
        } else if (i6 == 66) {
            i7 = rect2.right;
            i8 = rect.right;
        } else {
            if (i6 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i7 = rect2.bottom;
            i8 = rect.bottom;
        }
        return i7 - i8;
    }

    private static int o(int i6, Rect rect, Rect rect2) {
        int height;
        int i7;
        int height2;
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = rect.left + (rect.width() / 2);
            i7 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - (i7 + (height2 / 2)));
        }
        height = rect.top + (rect.height() / 2);
        i7 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - (i7 + (height2 / 2)));
    }
}
