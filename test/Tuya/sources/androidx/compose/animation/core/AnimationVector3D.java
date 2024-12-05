package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AnimationVector3D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;

    /* renamed from: v1, reason: collision with root package name */
    private float f13743v1;

    /* renamed from: v2, reason: collision with root package name */
    private float f13744v2;

    /* renamed from: v3, reason: collision with root package name */
    private float f13745v3;

    public AnimationVector3D(float f8, float f9, float f10) {
        super(null);
        this.f13743v1 = f8;
        this.f13744v2 = f9;
        this.f13745v3 = f10;
        this.size = 3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnimationVector3D) {
            AnimationVector3D animationVector3D = (AnimationVector3D) obj;
            if (animationVector3D.f13743v1 == this.f13743v1 && animationVector3D.f13744v2 == this.f13744v2 && animationVector3D.f13745v3 == this.f13745v3) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i8) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    return 0.0f;
                }
                return this.f13745v3;
            }
            return this.f13744v2;
        }
        return this.f13743v1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getV1() {
        return this.f13743v1;
    }

    public final float getV2() {
        return this.f13744v2;
    }

    public final float getV3() {
        return this.f13745v3;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f13743v1) * 31) + Float.floatToIntBits(this.f13744v2)) * 31) + Float.floatToIntBits(this.f13745v3);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.f13743v1 = 0.0f;
        this.f13744v2 = 0.0f;
        this.f13745v3 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i8, float f8) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    this.f13745v3 = f8;
                    return;
                }
                return;
            }
            this.f13744v2 = f8;
            return;
        }
        this.f13743v1 = f8;
    }

    public final void setV1$animation_core_release(float f8) {
        this.f13743v1 = f8;
    }

    public final void setV2$animation_core_release(float f8) {
        this.f13744v2 = f8;
    }

    public final void setV3$animation_core_release(float f8) {
        this.f13745v3 = f8;
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.f13743v1 + ", v2 = " + this.f13744v2 + ", v3 = " + this.f13745v3;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public AnimationVector3D newVector$animation_core_release() {
        return new AnimationVector3D(0.0f, 0.0f, 0.0f);
    }
}
