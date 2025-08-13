// langflowApi.ts
// Send chat message to Java Spring Boot backend

export async function sendLangflowMessage(message: string) {
  try {
    const response = await fetch('http://localhost:8080/api/langflow/send', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({ message }),
    });
    if (!response.ok) throw new Error(`HTTP error! status: ${response.status}`);
    return await response.json();
  } catch (error) {
    console.error('Error sending message to backend:', error);
    throw error;
  }
}
