package G4;

import G4.N;
import W4.v0;
import W4.w0;
import Z4.InterfaceC1592f;
import a5.C1642i;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class N extends RecyclerView.Adapter {

    /* renamed from: g, reason: collision with root package name */
    public static final a f3129g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3130a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1592f f3131b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3132c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3133d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f3134e;

    /* renamed from: f, reason: collision with root package name */
    private int f3135f;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private w0 f3136a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1592f f3137b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f3138c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ N f3139d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(N n8, w0 binding, InterfaceC1592f listener, Context context) {
            super(binding.getRoot());
            AbstractC3255y.i(binding, "binding");
            AbstractC3255y.i(listener, "listener");
            AbstractC3255y.i(context, "context");
            this.f3139d = n8;
            this.f3136a = binding;
            this.f3137b = listener;
            this.f3138c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b this$0, C1642i avatar, int i8, View view) {
            AbstractC3255y.i(this$0, "this$0");
            AbstractC3255y.i(avatar, "$avatar");
            this$0.f3137b.a(avatar, i8);
        }

        public final void b(final C1642i avatar, final int i8, boolean z8) {
            AbstractC3255y.i(avatar, "avatar");
            com.squareup.picasso.s.h().l(avatar.c()).n(UptodownApp.f29058B.f0(this.f3138c)).l(R.drawable.shape_avatar_item).i(this.f3136a.f12611b);
            this.f3136a.f12611b.setOnClickListener(new View.OnClickListener() { // from class: G4.O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    N.b.c(N.b.this, avatar, i8, view);
                }
            });
            if (z8) {
                this.f3136a.f12613d.setBackground(ContextCompat.getDrawable(this.f3138c, R.drawable.shape_avatar_selected_turbo_item));
            } else {
                this.f3136a.f12613d.setBackground(null);
            }
            if (this.f3139d.f3134e) {
                this.f3136a.f12612c.setVisibility(8);
            } else {
                this.f3136a.f12612c.setVisibility(0);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private v0 f3140a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1592f f3141b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f3142c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ N f3143d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(N n8, v0 binding, InterfaceC1592f listener, Context context) {
            super(binding.getRoot());
            AbstractC3255y.i(binding, "binding");
            AbstractC3255y.i(listener, "listener");
            AbstractC3255y.i(context, "context");
            this.f3143d = n8;
            this.f3140a = binding;
            this.f3141b = listener;
            this.f3142c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c this$0, C1642i avatar, int i8, View view) {
            AbstractC3255y.i(this$0, "this$0");
            AbstractC3255y.i(avatar, "$avatar");
            this$0.f3141b.a(avatar, i8);
        }

        public final void b(final C1642i avatar, final int i8, int i9, boolean z8) {
            AbstractC3255y.i(avatar, "avatar");
            com.squareup.picasso.s.h().l(avatar.c()).n(UptodownApp.f29058B.f0(this.f3142c)).l(R.drawable.shape_avatar_item).i(this.f3140a.f12597b);
            this.f3140a.f12597b.setOnClickListener(new View.OnClickListener() { // from class: G4.P
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    N.c.c(N.c.this, avatar, i8, view);
                }
            });
            this.f3140a.getRoot().setLayoutParams(new RelativeLayout.LayoutParams(i9, i9));
            if (z8) {
                this.f3140a.f12598c.setBackground(ContextCompat.getDrawable(this.f3142c, R.drawable.shape_avatar_selected_item));
            } else {
                this.f3140a.f12598c.setBackground(ContextCompat.getDrawable(this.f3142c, R.drawable.shape_avatar_item));
            }
        }
    }

    public /* synthetic */ N(ArrayList arrayList, InterfaceC1592f interfaceC1592f, int i8, int i9, boolean z8, int i10, AbstractC3247p abstractC3247p) {
        this(arrayList, interfaceC1592f, i8, (i10 & 8) != 0 ? 0 : i9, (i10 & 16) != 0 ? false : z8);
    }

    public final ArrayList b() {
        return this.f3130a;
    }

    public final int c() {
        return this.f3135f;
    }

    public final void d(int i8) {
        this.f3135f = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3130a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        Object obj = this.f3130a.get(i8);
        AbstractC3255y.h(obj, "avatars[pos]");
        C1642i c1642i = (C1642i) obj;
        if (viewHolder instanceof c) {
            if (this.f3135f == i8) {
                ((c) viewHolder).b(c1642i, i8, this.f3133d, true);
                return;
            } else {
                ((c) viewHolder).b(c1642i, i8, this.f3133d, false);
                return;
            }
        }
        if (viewHolder instanceof b) {
            if (this.f3135f == i8) {
                ((b) viewHolder).b(c1642i, i8, true);
            } else {
                ((b) viewHolder).b(c1642i, i8, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        int i9 = this.f3132c;
        if (i9 != 0) {
            if (i9 == 1) {
                w0 c8 = w0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC3255y.h(c8, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
                InterfaceC1592f interfaceC1592f = this.f3131b;
                Context context = viewGroup.getContext();
                AbstractC3255y.h(context, "viewGroup.context");
                return new b(this, c8, interfaceC1592f, context);
            }
            throw new IllegalArgumentException("ViewHolder unknown!!");
        }
        v0 c9 = v0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        AbstractC3255y.h(c9, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
        InterfaceC1592f interfaceC1592f2 = this.f3131b;
        Context context2 = viewGroup.getContext();
        AbstractC3255y.h(context2, "viewGroup.context");
        return new c(this, c9, interfaceC1592f2, context2);
    }

    public N(ArrayList avatars, InterfaceC1592f listener, int i8, int i9, boolean z8) {
        AbstractC3255y.i(avatars, "avatars");
        AbstractC3255y.i(listener, "listener");
        this.f3130a = avatars;
        this.f3131b = listener;
        this.f3132c = i8;
        this.f3133d = i9;
        this.f3134e = z8;
        this.f3135f = -1;
    }
}
