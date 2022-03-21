package Lesson13_2_5;

import Lesson13_2_5.Inerface.AvatarInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * this is class interceptor(perehvatchik)
 */
public class AvatarInvocationHandler implements InvocationHandler {
    private Avatar avatar;

    public AvatarInvocationHandler(Avatar avatar) {
        this.avatar = avatar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.isAnnotationPresent(Blocked.class)) {
                throw new Exception(" метод заблокирован прокси ");
            }
            return method.invoke(avatar, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return proxy;
    }
}
