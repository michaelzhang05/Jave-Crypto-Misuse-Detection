package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.i2;
import androidx.core.view.b1;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f194a;

    /* renamed from: b, reason: collision with root package name */
    final u f195b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f196c;

    /* renamed from: d, reason: collision with root package name */
    private final int f197d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f198e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f199f;

    /* renamed from: g, reason: collision with root package name */
    ListView f200g;

    /* renamed from: h, reason: collision with root package name */
    private View f201h;

    /* renamed from: i, reason: collision with root package name */
    private int f202i;

    /* renamed from: j, reason: collision with root package name */
    private int f203j;

    /* renamed from: k, reason: collision with root package name */
    private int f204k;

    /* renamed from: l, reason: collision with root package name */
    private int f205l;

    /* renamed from: m, reason: collision with root package name */
    private int f206m;

    /* renamed from: o, reason: collision with root package name */
    Button f208o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f209p;

    /* renamed from: q, reason: collision with root package name */
    Message f210q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f211r;

    /* renamed from: s, reason: collision with root package name */
    Button f212s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f213t;

    /* renamed from: u, reason: collision with root package name */
    Message f214u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f215v;

    /* renamed from: w, reason: collision with root package name */
    Button f216w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f217x;

    /* renamed from: y, reason: collision with root package name */
    Message f218y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f219z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f207n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: a, reason: collision with root package name */
        private final int f220a;

        /* renamed from: b, reason: collision with root package name */
        private final int f221b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.j.f6263c2);
            this.f221b = obtainStyledAttributes.getDimensionPixelOffset(d.j.f6268d2, -1);
            this.f220a = obtainStyledAttributes.getDimensionPixelOffset(d.j.f6273e2, -1);
        }

        public void a(boolean z5, boolean z6) {
            if (z6 && z5) {
                return;
            }
            setPadding(getPaddingLeft(), z5 ? getPaddingTop() : this.f220a, getPaddingRight(), z6 ? getPaddingBottom() : this.f221b);
        }
    }

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f208o || (message2 = alertController.f210q) == null) && (view != alertController.f212s || (message2 = alertController.f214u) == null)) ? (view != alertController.f216w || (message = alertController.f218y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f195b).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements NestedScrollView.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f223a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f224b;

        b(View view, View view2) {
            this.f223a = view;
            this.f224b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i6, int i7, int i8, int i9) {
            AlertController.f(nestedScrollView, this.f223a, this.f224b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f226a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f227b;

        c(View view, View view2) {
            this.f226a = view;
            this.f227b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.A, this.f226a, this.f227b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements AbsListView.OnScrollListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f229a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f230b;

        d(View view, View view2) {
            this.f229a = view;
            this.f230b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i6, int i7, int i8) {
            AlertController.f(absListView, this.f229a, this.f230b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i6) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f232a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f233b;

        e(View view, View view2) {
            this.f232a = view;
            this.f233b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.f200g, this.f232a, this.f233b);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;

        /* renamed from: a, reason: collision with root package name */
        public final Context f235a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f236b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f238d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f240f;

        /* renamed from: g, reason: collision with root package name */
        public View f241g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f242h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f243i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f244j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f245k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f246l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f247m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f248n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f249o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f250p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f251q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f253s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f254t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f255u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f256v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f257w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f258x;

        /* renamed from: y, reason: collision with root package name */
        public int f259y;

        /* renamed from: z, reason: collision with root package name */
        public View f260z;

        /* renamed from: c, reason: collision with root package name */
        public int f237c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f239e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean O = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f252r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends ArrayAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f261a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i6, int i7, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i6, i7, charSequenceArr);
                this.f261a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i6, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i6, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i6]) {
                    this.f261a.setItemChecked(i6, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b extends CursorAdapter {

            /* renamed from: a, reason: collision with root package name */
            private final int f263a;

            /* renamed from: b, reason: collision with root package name */
            private final int f264b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f265c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f266d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z5, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z5);
                this.f265c = recycleListView;
                this.f266d = alertController;
                Cursor cursor2 = getCursor();
                this.f263a = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f264b = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f263a));
                this.f265c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f264b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f236b.inflate(this.f266d.M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f268a;

            c(AlertController alertController) {
                this.f268a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
                f.this.f258x.onClick(this.f268a.f195b, i6);
                if (f.this.H) {
                    return;
                }
                this.f268a.f195b.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f270a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f271b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f270a = recycleListView;
                this.f271b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i6] = this.f270a.isItemChecked(i6);
                }
                f.this.J.onClick(this.f271b.f195b, i6, this.f270a.isItemChecked(i6));
            }
        }

        public f(Context context) {
            this.f235a = context;
            this.f236b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f236b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L26
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f235a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f256v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L26:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f235a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.H
                if (r1 == 0) goto L3c
                int r1 = r11.N
                goto L3e
            L3c:
                int r1 = r11.O
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f235a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.f257w
                if (r9 == 0) goto L62
                goto L6b
            L62:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f235a
                java.lang.CharSequence[] r3 = r10.f256v
                r9.<init>(r1, r4, r2, r3)
            L6b:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f258x
                if (r1 == 0) goto L7e
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
            L7a:
                r0.setOnItemClickListener(r1)
                goto L88
            L7e:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L88
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L7a
            L88:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.N
                if (r1 == 0) goto L8f
                r0.setOnItemSelectedListener(r1)
            L8f:
                boolean r1 = r10.H
                if (r1 == 0) goto L97
                r0.setChoiceMode(r8)
                goto L9f
            L97:
                boolean r1 = r10.G
                if (r1 == 0) goto L9f
                r1 = 2
                r0.setChoiceMode(r1)
            L9f:
                r11.f200g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.f.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f241g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f240f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f238d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i6 = this.f237c;
                if (i6 != 0) {
                    alertController.m(i6);
                }
                int i7 = this.f239e;
                if (i7 != 0) {
                    alertController.m(alertController.c(i7));
                }
            }
            CharSequence charSequence2 = this.f242h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f243i;
            if (charSequence3 != null || this.f244j != null) {
                alertController.k(-1, charSequence3, this.f245k, null, this.f244j);
            }
            CharSequence charSequence4 = this.f246l;
            if (charSequence4 != null || this.f247m != null) {
                alertController.k(-2, charSequence4, this.f248n, null, this.f247m);
            }
            CharSequence charSequence5 = this.f249o;
            if (charSequence5 != null || this.f250p != null) {
                alertController.k(-3, charSequence5, this.f251q, null, this.f250p);
            }
            if (this.f256v != null || this.K != null || this.f257w != null) {
                b(alertController);
            }
            View view2 = this.f260z;
            if (view2 != null) {
                if (this.E) {
                    alertController.t(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.s(view2);
                    return;
                }
            }
            int i8 = this.f259y;
            if (i8 != 0) {
                alertController.r(i8);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class g extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference f273a;

        public g(DialogInterface dialogInterface) {
            this.f273a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i6 = message.what;
            if (i6 == -3 || i6 == -2 || i6 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f273a.get(), message.what);
            } else {
                if (i6 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends ArrayAdapter {
        public h(Context context, int i6, int i7, CharSequence[] charSequenceArr) {
            super(context, i6, i7, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i6) {
            return i6;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, u uVar, Window window) {
        this.f194a = context;
        this.f195b = uVar;
        this.f196c = window;
        this.R = new g(uVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, d.j.F, d.a.f6124k, 0);
        this.J = obtainStyledAttributes.getResourceId(d.j.G, 0);
        this.K = obtainStyledAttributes.getResourceId(d.j.I, 0);
        this.L = obtainStyledAttributes.getResourceId(d.j.K, 0);
        this.M = obtainStyledAttributes.getResourceId(d.j.L, 0);
        this.N = obtainStyledAttributes.getResourceId(d.j.N, 0);
        this.O = obtainStyledAttributes.getResourceId(d.j.J, 0);
        this.P = obtainStyledAttributes.getBoolean(d.j.M, true);
        this.f197d = obtainStyledAttributes.getDimensionPixelSize(d.j.H, 0);
        obtainStyledAttributes.recycle();
        uVar.j(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void f(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i6 = this.K;
        return (i6 != 0 && this.Q == 1) ? i6 : this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i6, int i7) {
        View view2;
        Runnable eVar;
        View findViewById = this.f196c.findViewById(d.f.f6209v);
        View findViewById2 = this.f196c.findViewById(d.f.f6208u);
        if (Build.VERSION.SDK_INT < 23) {
            if (findViewById != null && (i6 & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i6 & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById == null && findViewById2 == null) {
                return;
            }
            if (this.f199f != null) {
                this.A.setOnScrollChangeListener(new b(findViewById, findViewById2));
                view2 = this.A;
                eVar = new c(findViewById, findViewById2);
            } else {
                ListView listView = this.f200g;
                if (listView != null) {
                    listView.setOnScrollListener(new d(findViewById, findViewById2));
                    view2 = this.f200g;
                    eVar = new e(findViewById, findViewById2);
                } else {
                    if (findViewById != null) {
                        viewGroup.removeView(findViewById);
                    }
                    if (findViewById2 == null) {
                        return;
                    }
                }
            }
            view2.post(eVar);
            return;
        }
        b1.G0(view, i6, i7);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 == null) {
            return;
        }
        viewGroup.removeView(findViewById2);
    }

    private void u(ViewGroup viewGroup) {
        int i6;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(R.id.button1);
        this.f208o = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f209p) && this.f211r == null) {
            this.f208o.setVisibility(8);
            i6 = 0;
        } else {
            this.f208o.setText(this.f209p);
            Drawable drawable = this.f211r;
            if (drawable != null) {
                int i7 = this.f197d;
                drawable.setBounds(0, 0, i7, i7);
                this.f208o.setCompoundDrawables(this.f211r, null, null, null);
            }
            this.f208o.setVisibility(0);
            i6 = 1;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button2);
        this.f212s = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f213t) && this.f215v == null) {
            this.f212s.setVisibility(8);
        } else {
            this.f212s.setText(this.f213t);
            Drawable drawable2 = this.f215v;
            if (drawable2 != null) {
                int i8 = this.f197d;
                drawable2.setBounds(0, 0, i8, i8);
                this.f212s.setCompoundDrawables(this.f215v, null, null, null);
            }
            this.f212s.setVisibility(0);
            i6 |= 2;
        }
        Button button4 = (Button) viewGroup.findViewById(R.id.button3);
        this.f216w = button4;
        button4.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f217x) && this.f219z == null) {
            this.f216w.setVisibility(8);
        } else {
            this.f216w.setText(this.f217x);
            Drawable drawable3 = this.f219z;
            if (drawable3 != null) {
                int i9 = this.f197d;
                drawable3.setBounds(0, 0, i9, i9);
                this.f216w.setCompoundDrawables(this.f219z, null, null, null);
            }
            this.f216w.setVisibility(0);
            i6 |= 4;
        }
        if (z(this.f194a)) {
            if (i6 == 1) {
                button = this.f208o;
            } else if (i6 == 2) {
                button = this.f212s;
            } else if (i6 == 4) {
                button = this.f216w;
            }
            b(button);
        }
        if (i6 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f196c.findViewById(d.f.f6210w);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f199f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f200g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f200g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void w(ViewGroup viewGroup) {
        View view = this.f201h;
        if (view == null) {
            view = this.f202i != 0 ? LayoutInflater.from(this.f194a).inflate(this.f202i, viewGroup, false) : null;
        }
        boolean z5 = view != null;
        if (!z5 || !a(view)) {
            this.f196c.setFlags(131072, 131072);
        }
        if (!z5) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f196c.findViewById(d.f.f6201n);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f207n) {
            frameLayout.setPadding(this.f203j, this.f204k, this.f205l, this.f206m);
        }
        if (this.f200g != null) {
            ((LinearLayout.LayoutParams) ((i2.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.view.View] */
    private void x(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            viewGroup2 = this.f196c.findViewById(d.f.O);
        } else {
            this.D = (ImageView) this.f196c.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(this.f198e)) && this.P) {
                TextView textView = (TextView) this.f196c.findViewById(d.f.f6197j);
                this.E = textView;
                textView.setText(this.f198e);
                int i6 = this.B;
                if (i6 != 0) {
                    this.D.setImageResource(i6);
                    return;
                }
                Drawable drawable = this.C;
                if (drawable != null) {
                    this.D.setImageDrawable(drawable);
                    return;
                } else {
                    this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
                    this.D.setVisibility(8);
                    return;
                }
            }
            this.f196c.findViewById(d.f.O).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup2 = viewGroup;
        }
        viewGroup2.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a5, code lost:
    
        r1.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a3, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void y() {
        /*
            r8 = this;
            android.view.Window r0 = r8.f196c
            int r1 = d.f.f6207t
            android.view.View r0 = r0.findViewById(r1)
            int r1 = d.f.P
            android.view.View r1 = r0.findViewById(r1)
            int r2 = d.f.f6200m
            android.view.View r2 = r0.findViewById(r2)
            int r3 = d.f.f6198k
            android.view.View r3 = r0.findViewById(r3)
            int r4 = d.f.f6202o
            android.view.View r0 = r0.findViewById(r4)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.w(r0)
            int r4 = d.f.P
            android.view.View r4 = r0.findViewById(r4)
            int r5 = d.f.f6200m
            android.view.View r5 = r0.findViewById(r5)
            int r6 = d.f.f6198k
            android.view.View r6 = r0.findViewById(r6)
            android.view.ViewGroup r1 = r8.i(r4, r1)
            android.view.ViewGroup r2 = r8.i(r5, r2)
            android.view.ViewGroup r3 = r8.i(r6, r3)
            r8.v(r2)
            r8.u(r3)
            r8.x(r1)
            int r0 = r0.getVisibility()
            r4 = 8
            r5 = 1
            r6 = 0
            if (r0 == r4) goto L58
            r0 = 1
            goto L59
        L58:
            r0 = 0
        L59:
            if (r1 == 0) goto L63
            int r7 = r1.getVisibility()
            if (r7 == r4) goto L63
            r7 = 1
            goto L64
        L63:
            r7 = 0
        L64:
            if (r3 == 0) goto L6e
            int r3 = r3.getVisibility()
            if (r3 == r4) goto L6e
            r3 = 1
            goto L6f
        L6e:
            r3 = 0
        L6f:
            if (r3 != 0) goto L7e
            if (r2 == 0) goto L7e
            int r4 = d.f.K
            android.view.View r4 = r2.findViewById(r4)
            if (r4 == 0) goto L7e
            r4.setVisibility(r6)
        L7e:
            if (r7 == 0) goto L9b
            androidx.core.widget.NestedScrollView r4 = r8.A
            if (r4 == 0) goto L87
            r4.setClipToPadding(r5)
        L87:
            java.lang.CharSequence r4 = r8.f199f
            if (r4 != 0) goto L92
            android.widget.ListView r4 = r8.f200g
            if (r4 == 0) goto L90
            goto L92
        L90:
            r1 = 0
            goto L98
        L92:
            int r4 = d.f.N
            android.view.View r1 = r1.findViewById(r4)
        L98:
            if (r1 == 0) goto La8
            goto La5
        L9b:
            if (r2 == 0) goto La8
            int r1 = d.f.L
            android.view.View r1 = r2.findViewById(r1)
            if (r1 == 0) goto La8
        La5:
            r1.setVisibility(r6)
        La8:
            android.widget.ListView r1 = r8.f200g
            boolean r4 = r1 instanceof androidx.appcompat.app.AlertController.RecycleListView
            if (r4 == 0) goto Lb3
            androidx.appcompat.app.AlertController$RecycleListView r1 = (androidx.appcompat.app.AlertController.RecycleListView) r1
            r1.a(r7, r3)
        Lb3:
            if (r0 != 0) goto Lc7
            android.widget.ListView r0 = r8.f200g
            if (r0 == 0) goto Lba
            goto Lbc
        Lba:
            androidx.core.widget.NestedScrollView r0 = r8.A
        Lbc:
            if (r0 == 0) goto Lc7
            if (r3 == 0) goto Lc1
            r6 = 2
        Lc1:
            r1 = r7 | r6
            r3 = 3
            r8.p(r2, r0, r1, r3)
        Lc7:
            android.widget.ListView r0 = r8.f200g
            if (r0 == 0) goto Ldd
            android.widget.ListAdapter r1 = r8.H
            if (r1 == 0) goto Ldd
            r0.setAdapter(r1)
            int r1 = r8.I
            r2 = -1
            if (r1 <= r2) goto Ldd
            r0.setItemChecked(r1, r5)
            r0.setSelection(r1)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.y():void");
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(d.a.f6123j, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i6) {
        TypedValue typedValue = new TypedValue();
        this.f194a.getTheme().resolveAttribute(i6, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f200g;
    }

    public void e() {
        this.f195b.setContentView(j());
        y();
    }

    public boolean g(int i6, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public boolean h(int i6, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public void k(int i6, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i6, onClickListener);
        }
        if (i6 == -3) {
            this.f217x = charSequence;
            this.f218y = message;
            this.f219z = drawable;
        } else if (i6 == -2) {
            this.f213t = charSequence;
            this.f214u = message;
            this.f215v = drawable;
        } else {
            if (i6 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f209p = charSequence;
            this.f210q = message;
            this.f211r = drawable;
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i6) {
        this.C = null;
        this.B = i6;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i6 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void o(CharSequence charSequence) {
        this.f199f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f198e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i6) {
        this.f201h = null;
        this.f202i = i6;
        this.f207n = false;
    }

    public void s(View view) {
        this.f201h = view;
        this.f202i = 0;
        this.f207n = false;
    }

    public void t(View view, int i6, int i7, int i8, int i9) {
        this.f201h = view;
        this.f202i = 0;
        this.f207n = true;
        this.f203j = i6;
        this.f204k = i7;
        this.f205l = i8;
        this.f206m = i9;
    }
}
