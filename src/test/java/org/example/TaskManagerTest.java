package org.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class TaskManagerTest {

    @Test
    public void menuTest_exit(){
        ApplicationConsole applicationConsoleMock = mock(ApplicationConsole.class);

        when(applicationConsoleMock.readLine())
                .thenReturn("add")
                .thenReturn("exit");

        TaskManager target = new TaskManager(applicationConsoleMock);
        target.menu();

        verify(applicationConsoleMock, times(2)).showMessage("Enter a command: (add, remove, mark, list, exit)");
    }
}
