package Lesson12_2_4;

import Lesson12_2_4.exceptions.LimitDimensionsException;
import Lesson12_2_4.exceptions.LimitSpeed100Exception;
import Lesson12_2_4.exceptions.LimitSpeed80Exception;
import Lesson12_2_4.exceptions.LimitWeightException;

public interface Automotive {
    void speedCheck() throws LimitSpeed80Exception, LimitSpeed100Exception;

    void dimensions() throws LimitDimensionsException, LimitWeightException;
}
